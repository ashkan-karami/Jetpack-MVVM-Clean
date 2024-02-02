package com.sample.common.data.remote

import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface MovieApiService {

    @GET("posts")
    fun getAllPostsAsync(): Deferred<List<*>>
}