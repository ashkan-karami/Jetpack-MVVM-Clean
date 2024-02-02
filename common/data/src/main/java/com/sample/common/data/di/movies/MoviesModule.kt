package com.sample.common.data.di.movies

import com.sample.common.data.remote.MovieApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class MoviesModule {

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): MovieApiService {
        return retrofit.create(MovieApiService::class.java)
    }
}