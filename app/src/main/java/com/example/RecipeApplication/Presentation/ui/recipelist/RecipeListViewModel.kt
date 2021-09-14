package com.example.RecipeApplication.Presentation.ui.recipelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.RecipeApplication.domain.model.Recipe
import com.example.RecipeApplication.repository.RecipeRepository
import com.example.RecipeApplication.repository.RecipeRepository_Impl
import kotlinx.coroutines.launch
import javax.inject.Named


class RecipeListViewModel
@ViewModelInject
constructor(
            private val repository: RecipeRepository,
            private  val auth_token:String,
):ViewModel(){

        val recipes: MutableState<List<Recipe>> = mutableStateOf(listOf())



    init {
        newSearch()

    }


        fun newSearch(){
            viewModelScope.launch {
                val result=repository.search(
                    page= 1,
                    token = auth_token,
                    query = "chicken",

                    )
                recipes.value=result

            }

        }



    }


