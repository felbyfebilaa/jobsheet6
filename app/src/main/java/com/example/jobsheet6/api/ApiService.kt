package com.example.jobsheet6.api

import com.example.jobsheet6.ResponsMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponsMorty>
}