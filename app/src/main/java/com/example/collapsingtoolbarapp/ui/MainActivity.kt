package com.example.collapsingtoolbarapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.collapsingtoolbarapp.R
import com.example.collapsingtoolbarapp.adapter.ItemAdapter
import com.example.collapsingtoolbarapp.data.Datasource
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadResources()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val appBarLayout = findViewById<AppBarLayout>(R.id.app_bar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        val collapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbar)
        appBarLayout.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            var isShow = false
            var scrollRange = -1
            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.title = "Home"
                    isShow = false
                } else {
                    collapsingToolbarLayout.title = ""
                    isShow = true
                }
            }
        })
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        }
        else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}