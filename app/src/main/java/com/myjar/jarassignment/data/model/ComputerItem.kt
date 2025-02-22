package com.myjar.jarassignment.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "ComputerItem")
data class ComputerItem(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id") var id: String = "",
    @SerializedName("name") var name: String = "",
    @SerializedName("data") var data: ItemData? = ItemData()
)

data class ItemData(
    @SerializedName("color") var color: String? = "",
    @SerializedName("capacity") var capacity: String? = "",
    @SerializedName("price") val price: Double? = null,
    @SerializedName("capacity GB") val capacityGB: Int? = null,
    @SerializedName("Screen size") val screenSize: Double? = null,
    @SerializedName("Description") val description: String? = null,
    @SerializedName("Generation") val generation: String? = null,
    @SerializedName("Strap Colour") val strapColour: String? = null,
    @SerializedName("Case Size") val caseSize: String? = null,
    @SerializedName("CPU model") val cpuModel: String? = null,
    @SerializedName("Hard disk size") val hardDiskSize: String? = null
)
