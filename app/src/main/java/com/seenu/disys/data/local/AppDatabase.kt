package com.seenu.disys.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.seenu.disys.data.entities.Data
import com.seenu.disys.utils.DB_Name
import com.seenu.disys.utils.typeConveters.ConvertersData

//Database class for Room DB
@Database(entities = [Data::class], version = 1, exportSchema = false)
@TypeConverters(value = [ ConvertersData::class])
abstract class AppDatabase : RoomDatabase() {
	//Abstract method for access DAO 
    abstract fun Dao(): DatabaseDao

	//Singleton design pattern to access database instanse
    companion object {
        @Volatile private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase =
            instance ?: synchronized(this) { instance ?: buildDatabase(context).also { instance = it } }

        private fun buildDatabase(appContext: Context) =
            Room.databaseBuilder(appContext, AppDatabase::class.java, DB_Name)
                .fallbackToDestructiveMigration()
                .build()
    }

}