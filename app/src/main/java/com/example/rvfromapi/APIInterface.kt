package com.example.rvfromapi

import retrofit2.Call
import retrofit2.http.*

interface APIInterface {

    @Headers("Content-Type: application/json")
    @GET("people/")
    fun getdat(): Call<List<celep.dat>>


    @Headers("Content-Type: application/json")
    @POST("people/")
    fun adddat(@Body data: celep.dat): Call<celep.dat>

    @Headers("Content-Type: application/json")
    @PUT("people/{id}")
    fun updatedat(@Path("id")id:Int, @Body data: celep.dat): Call<celep.dat>

    @Headers("Content-Type: application/json")
    @DELETE("people/{id}")
    fun deldat(@Path("id")id:Int): Call<celep.dat>
}