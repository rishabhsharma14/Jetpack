package com.example.RecipeApplication.network.model

import com.google.gson.annotations.SerializedName

data class RecipeDto(

    @SerializedName("pk")
    var pk:Int?=null,

    @SerializedName("title")
    var title: String?=null,
    @SerializedName("publisher")
    var publisher: String?=null,
    @SerializedName( "featured_image")
    var featuredimage: String?=null,
    @SerializedName("rating")
    var rating: Int?=0,
    @SerializedName("source_url")
    var sourceurl: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("cooking_instructions")
    var cookinginstructions: String?=null,
    @SerializedName("ingredients")
    var ingredients: List<String>?= null,
    @SerializedName( "date_added")
    var dateadded: String?=null,
    @SerializedName("date_updated")
    var dateupdated: String?=null,

    )







