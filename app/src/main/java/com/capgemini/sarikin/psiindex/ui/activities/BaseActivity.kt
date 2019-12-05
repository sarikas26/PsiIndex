package com.capgemini.sarikin.psiindex.ui.activities

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.capgemini.sarikin.psiindex.R

/**
 * Created by Sarika Singh
 */
open class BaseActivity : AppCompatActivity() {
    private lateinit var builder: AlertDialog.Builder
    private var dialog: AlertDialog? = null

    /**
     * Create and display/hide progress bar.
     */
    fun displayProgressDialog(show: Boolean) {
        if (null == dialog) {
            builder = AlertDialog.Builder(this)
            builder.setView(R.layout.view_loader)
            builder.setCancelable(false)
            dialog = builder.create()
        }
        if (show) {
            dialog?.show()
        } else {
            dialog?.dismiss()
        }
    }
}