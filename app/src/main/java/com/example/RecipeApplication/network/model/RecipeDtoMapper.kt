package com.example.RecipeApplication.network.model

import com.example.RecipeApplication.domain.model.Recipe
import com.example.RecipeApplication.domain.util.DomainModel

class RecipeDtoMapper: DomainModel<RecipeDto,Recipe> {
    override fun mapToDomainModel(model: RecipeDto): Recipe {
        return Recipe(
            pk=model.pk,
            title = model.title,
            featuredimage = model.featuredimage,
            rating = model.rating,
            publisher = model.publisher,
            sourceurl = model.sourceurl,
            description = model.description,
            cookinginstruction = model.cookinginstructions,
            ingredients = model.ingredients?: listOf(),
            dateAdded = model.dateadded,
            dateUpdated = model.dateupdated,

        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDto {
        return RecipeDto(
            pk=domainModel.pk,
            title = domainModel.title,
            featuredimage = domainModel.featuredimage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            sourceurl = domainModel.sourceurl,
            description = domainModel.description,
            cookinginstructions = domainModel.cookinginstruction,
            ingredients = domainModel.ingredients?: listOf(),
            dateadded = domainModel.dateAdded,
            dateupdated = domainModel.dateUpdated,

        )
    }
          fun ToDomainList(initial: List<RecipeDto>): List<Recipe>{
              return initial.map{mapToDomainModel(it)}
          }

           fun fromDomainList(initial: List<Recipe>): List<RecipeDto>{
               return initial.map{mapFromDomainModel(it)}
           }

}