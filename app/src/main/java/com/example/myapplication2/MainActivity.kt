package com.example.myapplication2

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = ArrayList<Model>()

        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))
        list.add(Model("Diyorbekk", "1234567890", R.drawable.baseline_person_24))


        listView.adapter = MyListAdapter(this, R.layout.list_item, list)


    }
}
