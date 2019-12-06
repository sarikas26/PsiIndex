package com.capgemini.sarikin.psiindex.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capgemini.sarikin.psiindex.R
import com.capgemini.sarikin.psiindex.model.ReadingDetailsPair

/**
 * Created by Sarika Singh
 */
class CustomDialogAdapter(
    private val readingDetailsPair: List<ReadingDetailsPair>
) : RecyclerView.Adapter<CustomDialogAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): DataViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.readings_dialog_item, parent, false)

        return DataViewHolder(v)
    }

    override fun onBindViewHolder(dataViewHolder: DataViewHolder, i: Int) {
        dataViewHolder.mTextView.text = readingDetailsPair[i].title +  " : " +readingDetailsPair[i].value
    }

    override fun getItemCount(): Int {
        return readingDetailsPair.size
    }


    inner class DataViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var mTextView: TextView = v.findViewById(R.id.reading_detail)
    }
}