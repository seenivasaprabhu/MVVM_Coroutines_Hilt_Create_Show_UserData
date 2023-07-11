package com.seenu.disys.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.seenu.disys.data.entities.Data
import com.seenu.disys.utils.DB_TableName
//DAO class for Room DB
@Dao
    interface DatabaseDao {
	// Query to get all  record from room database
        @Query("SELECT * FROM $DB_TableName")
        fun getAllRecords() : LiveData<List<Data>>
	//Insert all records to room database
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertAll(Records: List<Data>)

    }
