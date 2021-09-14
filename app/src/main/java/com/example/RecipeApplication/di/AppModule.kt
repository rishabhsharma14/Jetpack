package com.example.RecipeApplication.di

import android.content.Context
import com.example.RecipeApplication.Presentation.BaseApplicationClass
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object AppModule{

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app : Context): BaseApplicationClass {

        return app as BaseApplicationClass

    }



    }


