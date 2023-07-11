package com.seenu.disys.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.seenu.disys.utils.DB_TableName


@Entity(tableName = DB_TableName)
data class Data(
    @ColumnInfo(name = "email") @SerializedName("email") val email: String,
    @ColumnInfo(name = "gender") @SerializedName("gender") val gender: String,
    @PrimaryKey @ColumnInfo(name = "id") @SerializedName("id") val id: Int,
    @ColumnInfo(name = "name") @SerializedName("name") val name: String,
    @ColumnInfo(name = "status") @SerializedName("status") val status: String
)





