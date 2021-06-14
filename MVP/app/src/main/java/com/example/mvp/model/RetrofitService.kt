package com.example.mvc.model

import com.example.mvc.model.MainApi
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



private const val BASE_URL =
    "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/"

val gson = GsonBuilder().setLenient().create()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create(gson))
    .baseUrl(BASE_URL)
    .build()

object MainService {
    val retrofitService : MainApi by lazy {
        retrofit.create(MainApi::class.java)
    }
}
