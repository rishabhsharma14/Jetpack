package com.example.RecipeApplication.domain.util

interface DomainModel <T, DomainModel>{

    fun mapToDomainModel(model: T):DomainModel
    fun mapFromDomainModel(domainModel: DomainModel):T

}
