package com.example.akakcechallenge.network

import com.example.akakcechallenge.data.DetailScreenResult
import com.example.akakcechallenge.data.MainResult
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

interface ApiService {
    @GET("59906f35-d5d5-40f7-8d44-53fd26eb3a05")
    suspend fun getMainPage(): MainResult

    @GET("1a1fb542-22d1-4919-914a-750114879775")
    suspend fun getDetailPage(
        @Query("code") code: String
    ): DetailScreenResult
}

@Module
@InstallIn(SingletonComponent::class)
object API {
    private const val BASE_URL = "https://mocki.io/v1/"

    @Singleton
    @Provides
    fun providesMoshi() = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Singleton
    @Provides
    fun providesRetrofit(moshi: Moshi) =
        Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL).build()

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}