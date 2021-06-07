package com.example.mvc.model

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {

    @GET("getMsrstnAcctoRltmMesureDnsty")
     suspend fun listAir(
        @Query("serviceKey") serviceKey: String,
        @Query("returnType") returnType: String,
        @Query("numOfRows") numOfRows: Int,
        @Query("pageNo") pageNo: Int,
        @Query("stationName") stationName: String,
        @Query("dataTerm") dataTerm: String,
        @Query("ver") ver: Double,
    ): Response<body>
}