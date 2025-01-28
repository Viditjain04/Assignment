package com.myjar.jarassignment.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.myjar.jarassignment.data.model.ComputerItem

@Dao
interface ComputerItemDao {

    @Query("SELECT * from ComputerItem")
    suspend fun getComputerItemsList(): List<ComputerItem>

    @Insert
    suspend fun addComputerItem(computerItemList: List<ComputerItem>)
}