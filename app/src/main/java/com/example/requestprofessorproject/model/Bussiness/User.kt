package com.example.requestprofessorproject.model.Bussiness

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var imgBackgroundUser: String,
    var imgAvatarUser: String,
    var nome : String,
    var idade : String,
    var esoecialidade: String,
    var fullInfo: String,
    var whapp : String,
    var instagram : String,
    var locate : String
): Parcelable {


}