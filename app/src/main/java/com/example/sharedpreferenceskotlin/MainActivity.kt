package com.example.sharedpreferenceskotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createData()
    }

    private fun createData() {
        val sharedPreferences: SharedPreferences =
            getSharedPreferences("kotlinsharedpreference", Context.MODE_PRIVATE)

        btnSave.setOnClickListener {
            val name: String = editName.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("name_key", name)
            editor.apply()

            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }
    }
}