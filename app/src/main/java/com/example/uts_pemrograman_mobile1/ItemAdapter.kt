package com.example.uts_pemrograman_mobile1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter(private val context: Context, private val itemList: List<ItemData>) : BaseAdapter() {

    override fun getCount(): Int = itemList.size

    override fun getItem(position: Int): ItemData = itemList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_lists, parent, false)
        }

        val imageView = view!!.findViewById<ImageView>(R.id.imageView)
        val textView = view!!.findViewById<TextView>(R.id.textView)

        val itemData = getItem(position)
        imageView.setImageResource(itemData.image)
        textView.text = itemData.text

        return view
    }
}
