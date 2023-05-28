package com.example.databindingtut

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.databinding.DataBindingUtil
import com.example.databindingtut.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainXml : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       val user = User("Pranjal", "21")
        mainXml.user = user
        mainXml.tv.text = "df"
    }
}