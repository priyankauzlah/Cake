package com.uzlah.cake

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cake(
    var name: String,
    var price: String,
    var photo: Int,
    var desc : String
) : Parcelable