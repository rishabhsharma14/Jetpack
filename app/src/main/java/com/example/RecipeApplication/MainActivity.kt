package com.example.RecipeApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.RecipeApplication.network.RecipeRetrofitService
import com.google.gson.GsonBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service=Retrofit.Builder().baseUrl("https://food2fork.ca/api/recipe/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()
            .create(RecipeRetrofitService::class.java)

        CoroutineScope(IO).launch{
            val recipe=service.get(
                token = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48",
                id= 583
            )
            Log.d("MainActivity", "onCreate: ${recipe.title}")
        }



            }
        }

