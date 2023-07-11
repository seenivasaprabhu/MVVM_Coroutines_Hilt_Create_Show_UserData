package com.seenu.disys.utils

import java.lang.reflect.Type

//interface for jsonparser
interface JsonParser {
    fun<T> fromJson(json:String,type: Type):T?
    fun <T> toJson(obj:T,type: Type):String?
}