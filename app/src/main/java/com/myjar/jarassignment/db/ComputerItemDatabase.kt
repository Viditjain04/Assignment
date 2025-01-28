package com.myjar.jarassignment.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.myjar.jarassignment.data.model.ComputerItem

@Database(entities = [ComputerItem::class], version = 1)
abstract class ComputerItemDatabase: RoomDatabase() {

    abstract fun getComputerDao(): ComputerItemDao
}