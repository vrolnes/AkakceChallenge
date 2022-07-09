package com.example.akakcechallenge.api

import com.example.akakcechallenge.models.DetailScreenResult
import com.example.akakcechallenge.models.MainResult
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("59906f35-d5d5-40f7-8d44-53fd26eb3a05")
    suspend fun getMainPage(): MainResult

    @GET("1a1fb542-22d1-4919-914a-750114879775")
    suspend fun getDetailPage(
        @Query("code") code: String
    ): DetailScreenResult
}