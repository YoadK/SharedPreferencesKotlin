package com.example.sharedpreferenceskotlin

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        getData()
    }

    private fun getData() {
        val sharedPreferences: SharedPreferences =
            this.getSharedPreferences("kotlinsharedpreference", Context.MODE_PRIVATE)
        val sharedNameValue = sharedPreferences.getString("name_key", "defaultname")

        textData.setText(sharedNameValue)
    }
}