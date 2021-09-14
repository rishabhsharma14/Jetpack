package com.example.RecipeApplication.di

import android.media.session.MediaSession
import com.example.RecipeApplication.network.model.RecipeDtoMapper
import com.example.RecipeApplication.network.response.RecipeRetrofitService
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)

 object NetworkModule {

     @Singleton
     @Provides
     fun providemapper(): RecipeDtoMapper {
         return RecipeDtoMapper()

     }

    @Singleton
    @Provides
                fun provideretrofitservice():RecipeRetrofitService {
                    return Retrofit.Builder().baseUrl("https://food2fork.ca/api/recipe/")
                        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()
                .create(RecipeRetrofitService::class.java)
    }


    @Singleton
    @Provides

    fun auth_token():String{
        return "Token 9c8b06d329136da358c2d00e76946b0111ce2c48"
    }

    }
