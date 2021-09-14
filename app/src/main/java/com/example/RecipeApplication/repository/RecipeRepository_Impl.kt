package com.example.RecipeApplication.repository

import com.example.RecipeApplication.domain.model.Recipe
import com.example.RecipeApplication.network.response.RecipeRetrofitService
import com.example.RecipeApplication.network.model.RecipeDtoMapper

class   RecipeRepository_Impl(
    private val recipeRetrofitService: RecipeRetrofitService,
    private val mapper:RecipeDtoMapper

): RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.ToDomainList(recipeRetrofitService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeRetrofitService.get(token, id))
    }
}