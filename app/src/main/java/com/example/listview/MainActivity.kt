package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        //val season = arrayOf("Spring", "Summer", "Fall", "Winter")
        var list = ArrayList<Model>()

        list.add(Model("Enok", "Dragon", R.drawable.ic_launcher_background))

        listView.adapter = MyCustomAdapter(this, R.layout.custome_item_layout, list)

//        listView.setOnItemClickListener{ adapterView, view, i, l ->
//            Toast.makeText(this, season[i] + " is the best season",Toast.LENGTH_LONG).show()
//        }

    }
}