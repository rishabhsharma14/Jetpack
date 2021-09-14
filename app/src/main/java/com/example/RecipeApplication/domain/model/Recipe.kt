package com.example.RecipeApplication.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Recipe(
    val pk: Int? =null,
    val title:String?=null,
    val publisher:String?=null,
    val featuredimage:String?=null,
    val rating: Int?=0,
    val sourceurl:String?=null,
    val description:String?=null,
    val cookinginstruction:String?=null,
    val ingredients: List<String> = listOf(),
    val dateAdded: String?=null,
    val dateUpdated: String?=null,

) : Parcelable