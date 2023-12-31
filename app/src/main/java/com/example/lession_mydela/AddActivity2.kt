package com.example.lession_mydela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lession_mydela.databinding.ActivityAdd2Binding
import com.example.lession_mydela.util.PreferencesManager

class AddActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityAdd2Binding
    lateinit var preferences: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdd2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences= PreferencesManager(this)

        binding.btnAdd.setOnClickListener {
            preferences.putString(binding.editTextKey.text.toString(),binding.editTextValue.text.toString())
            finish()
        }


    }
}