package com.example.lession_mydela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lession_mydela.databinding.ActivityMainBinding
import com.example.lession_mydela.util.PreferencesManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var preferences:PreferencesManager
    override fun onCreate(savedInstanceState: Bundle?) {

        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        preferences = PreferencesManager(this)

        binding.btnAdd.setOnClickListener(){
            var intent = Intent(this,AddActivity2::class.java)
            startActivity(intent)
        }

        binding.btnOk.setOnClickListener(){
            binding.text.text = preferences.getString(binding.enterText.text.toString())
        }
    }
}