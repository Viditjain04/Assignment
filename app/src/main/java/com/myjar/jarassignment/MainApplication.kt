package com.myjar.jarassignment

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.myjar.jarassignment.db.ComputerItemDatabase

class MainApplication: Application() {

    private var INSTANCE: ComputerItemDatabase? = null

    fun getInstance(): ComputerItemDatabase {
        if (INSTANCE == null) {
            synchronized(ComputerItemDatabase::class) {
                INSTANCE = buildRoomDB(applicationContext)
            }
        }
        return INSTANCE!!
    }

    private fun buildRoomDB(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            ComputerItemDatabase::class.java,
            "ComputerItemDatabase"
        ).build()
}