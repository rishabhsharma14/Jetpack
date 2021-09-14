package com.example.RecipeApplication.Presentation.ui.recipelist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.RecipeApplication.Presentation.Components.Cardview
import com.example.RecipeApplication.R
import com.example.RecipeApplication.domain.model.Recipe
import com.example.RecipeApplication.util.TAG

import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext


@AndroidEntryPoint
class RecipeListFragment: Fragment() {


    val  viewModel : RecipeListViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return ComposeView(requireContext()).apply {

                setContent {
                        val recipes= viewModel.recipes.value
                    
                    
                    LazyColumn{
                        itemsIndexed(
                            items=recipes
                        ){ index, recipe->
                            Cardview(recipe= recipe, onClick={ })
                        }
                    }

                        }
                            
                        }
                        
                    }
                }













