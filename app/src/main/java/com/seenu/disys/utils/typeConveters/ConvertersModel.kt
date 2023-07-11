package com.seenu.disys.utils.typeConveters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seenu.disys.data.entities.Data

//Type converter class for access model
  class ConvertersModel{
	//convert model to string
    @TypeConverter
    fun toJson(data: ArrayList<Data>):String{
        return Gson().toJson(data)
    }
	//convert string to model
    @TypeConverter
    fun fromJson(json:String):ArrayList<Data>{
        return Gson().fromJson<ArrayList<Data>>(json)
    }
    private inline fun <reified T> Gson.fromJson(json:String) = fromJson<T>(json,object :TypeToken<T>(){}.type)

}