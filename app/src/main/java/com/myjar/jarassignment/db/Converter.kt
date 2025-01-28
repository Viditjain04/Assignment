package com.myjar.jarassignment.db

import androidx.room.TypeConverter
import com.myjar.jarassignment.data.model.ItemData

class Converter {

    @TypeConverter
    fun convertComputerItemToString(itemData: ItemData): String{
        return itemData.toString()
    }

    @TypeConverter
    fun convertStringToComputerItem(itemData: String): ItemData{
        return ItemData()
    }
}