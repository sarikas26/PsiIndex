package com.capgemini.sarikin.psiindex.ui.activities

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import com.capgemini.sarikin.psiindex.R
import com.capgemini.sarikin.psiindex.model.PsiResponse
import com.capgemini.sarikin.psiindex.viewmodel.PsiDataViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Sarika Singh
 *
 * Activity to display Psi Index data on google maps.
 */
class MainActivity : BaseActivity(), OnMapReadyCallback {

    @Inject
    lateinit var psiDataViewModel: PsiDataViewModel

    private var mapFragment: SupportMapFragment? = null
    private var googleMap: GoogleMap? = null
    private lateinit var psiData: PsiResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        supportActionBar?.title = getString(R.string.app_title)

        mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment

        psiDataViewModel.fetchDataFromApi()
        addObservers()
    }

    /**
     * Method to add observers for ViewModel consumed methods.
     */
    private fun addObservers() {
        // Observe api success data response.
        psiDataViewModel.getResponseData().observe(
            this,
            Observer { psiData ->
                this.psiData = psiData
                Log.d("MainActivity123", psiData.items.size.toString())
                mapFragment?.getMapAsync(this)
            })

        // Observe api error message.
        psiDataViewModel.getErrorMsg().observe(
            this,
            Observer { message ->
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            })

        // Observe progress dialog status.
        psiDataViewModel.getProgressDialog().observe(this,
            Observer { bool ->
                displayProgressDialog(bool)
            })
    }

    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap
        val test = LatLng(
            psiData.region_metadata[0].label_location.latitude,
            psiData.region_metadata[0].label_location.longitude
        )
        // Getting LatLong for all the regions except national.
        for (i in psiData.region_metadata.indices) {
            if (psiData.region_metadata[i].name != getString(R.string.national_string)) {
                drawMarkers(
                    LatLng(
                        psiData.region_metadata[i].label_location.latitude,
                        psiData.region_metadata[i].label_location.longitude
                    ), psiData.region_metadata[i].name
                )
            }
        }

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(test, 10f))
    }

    /**
     * Draw marker on google map.
     */
    private fun drawMarkers(latLng: LatLng, name: String) {
        val markerOptions = MarkerOptions()
        markerOptions.position(latLng).title(getString(R.string.marker_title_string, name))

        googleMap?.addMarker(markerOptions)
    }
}
