package com.example.RecipeApplication.Presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.RecipeApplication.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

   private val Tag: String="Appddebug"

    @Inject
    lateinit var something:String

    @Inject
    lateinit var baseapplication: BaseApplicationClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(Tag, "Oncreate: ${something}")
        Log.d(Tag,"Oncreate: ${baseapplication}")

            }
        }

