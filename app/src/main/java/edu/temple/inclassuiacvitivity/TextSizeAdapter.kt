package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class TextSizeAdapter(context: Context, private val sizes: List<Int>) :
    ArrayAdapter<Int>(context, android.R.layout.simple_spinner_item, sizes) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(android.R.layout.simple_spinner_item, parent, false)

        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = sizes[position].toString()
        textView.textSize = 22f

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(android.R.layout.simple_spinner_dropdown_item, parent, false)

        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = sizes[position].toString()
        textView.textSize = sizes[position].toFloat()

        return view
    }
}
