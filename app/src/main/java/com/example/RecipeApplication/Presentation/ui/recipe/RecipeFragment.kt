package com.example.RecipeApplication.Presentation.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment

class RecipeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply { 
            
            setContent { 
                
                Column(Modifier.padding(10.dp)) {
                    Text(text = "THIS IS NOW THE RECIPE SCREEN" , style = androidx.compose.ui.text.TextStyle(fontSize = 40.sp))


                    }
                }

            }
        }
    }
