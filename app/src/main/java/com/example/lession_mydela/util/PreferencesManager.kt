package com.example.lession_mydela.util

import android.content.Context
import android.provider.SyncStateContract.Constants

class PreferencesManager(context: Context) {
    private val sharedPreferences = context.getSharedPreferences(Contances.TABLE_NAME,Context.MODE_PRIVATE)


    fun putString (key:String,str:String){
        val editor = sharedPreferences.edit()
        editor.putString(key,str)
        editor.apply()
    }

    fun getString(key:String) :String?{
        return sharedPreferences.getString(key,null)
    }
}