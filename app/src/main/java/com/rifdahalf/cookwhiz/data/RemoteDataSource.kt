package com.rifdahalf.cookwhiz.data

import com.rifdahalf.cookwhiz.data.network.FoodRecipesApi
import com.rifdahalf.cookwhiz.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
        private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}