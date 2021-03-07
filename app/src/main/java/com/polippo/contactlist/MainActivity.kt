package com.polippo.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adpter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        updateList()
    }

    private fun bindView(){
        rvList.adapter = adpter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList(){
        adpter.updateList(
            arrayListOf(
                Contact(
                    "Luis Polippo",
                    "(00) 0000-0000",
                    "img.png"
                ),
                Contact(
                    "Guilherme Correa",
                    "(00) 9999-9999",
                    "img.png"
                )
            )
        )
    }
}