package com.example.mvc.model

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {

    @GET("getMsrstnAcctoRltmMesureDnsty")
     suspend fun listAir(
        @Query("returnType") returnType: String,
        @Query("serviceKey",encoded = true) serviceKey: String,
        @Query("numOfRows") numOfRows: Int,
        @Query("pageNo") pageNo: Int,
        @Query("stationName") stationName: String,
        @Query("dataTerm") dataTerm: String,
        @Query("ver") ver: Double,
    ): Response<MainDao>
}