package com.capgemini.sarikin.psiindex.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capgemini.sarikin.psiindex.R
import com.capgemini.sarikin.psiindex.viewmodel.PsiDataViewModel
import com.google.android.gms.maps.SupportMapFragment
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Sarika Singh
 *
 * Activity to display Psi Index data on google maps.
 */
class MainActivity : AppCompatActivity() {

    @Inject lateinit var psiDataViewModel: PsiDataViewModel

    private var mapFragment: SupportMapFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        supportActionBar?.title = getString(R.string.app_title)

        mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment

        psiDataViewModel.fetchDataFromApi()
    }
}
