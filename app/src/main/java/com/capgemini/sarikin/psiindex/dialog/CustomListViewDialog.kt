package com.capgemini.sarikin.psiindex.dialog

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capgemini.sarikin.psiindex.R
import kotlinx.android.synthetic.main.reading_details_dialog.*

/**
 * Created by Sarika Singh
 *
 * Custom Dialog class for displaying regional psi index details.
 */
class CustomListViewDialog(
    private var activity: Activity,
    private var adapter: RecyclerView.Adapter<*>
) : Dialog(activity) {

    private var recyclerView: RecyclerView? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setCancelable(true)
        setContentView(R.layout.reading_details_dialog)

        recyclerView = recycler_view
        mLayoutManager = LinearLayoutManager(activity)
        recyclerView?.layoutManager = mLayoutManager
        recyclerView?.adapter = adapter
    }
}