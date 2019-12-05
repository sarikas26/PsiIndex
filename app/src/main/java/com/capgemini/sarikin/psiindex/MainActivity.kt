package com.capgemini.sarikin.psiindex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.SupportMapFragment

/**
 * Created by Sarika Singh
 */
class MainActivity : AppCompatActivity() {

    private var mapFragment: SupportMapFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = getString(R.string.app_title)

        mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
    }
}
