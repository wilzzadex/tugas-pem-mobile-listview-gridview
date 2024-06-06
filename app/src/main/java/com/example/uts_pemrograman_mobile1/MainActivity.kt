package com.example.uts_pemrograman_mobile1

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val itemList = listOf(
            ItemData(R.drawable.avatar, "Ahmad Waliyuddin"),
            ItemData(R.drawable.wavatar, "Dinda"),
            ItemData(R.drawable.avatar, "Yusri")
        )

        val adapter = ItemAdapter(this, itemList)
        listView.adapter = adapter

    }
}

data class ItemData(
    val image: Int,
    val text: String
)



