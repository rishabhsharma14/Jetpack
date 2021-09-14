package com.example.RecipeApplication.di

import com.example.RecipeApplication.network.model.RecipeDtoMapper
import com.example.RecipeApplication.network.response.RecipeRetrofitService
import com.example.RecipeApplication.repository.RecipeRepository
import com.example.RecipeApplication.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        recipeRetrofitService: RecipeRetrofitService,
        recipedtomapper: RecipeDtoMapper
    ): RecipeRepository {

        return RecipeRepository_Impl(recipeRetrofitService,recipedtomapper)

    }
}