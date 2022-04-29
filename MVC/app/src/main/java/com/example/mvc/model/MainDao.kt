package com.example.mvc.model

data class MainDao(val response: Response)
data class Response(val body: Body, val header: Header)
data class Header(val resultMsg: String, val resultCode: String)
data class Body(val totalCount: Int, val items: List<Item>, val pageNo: Int, val numOfRows: Int)
data class Item(
    val dataTime: String,
    val so2Value: String,
    val coValue: String,
    val o3Value: String,
    val no2Value: String,
    val pm10Value: String,
    val pm25Value: String,
    val khaiValue: String,
    val so2VGrade: String,
    val coGrade: String,
    val o3Grade: String,
    val no2Grade: String,
    val pm10Grade: String,
    val pm25Grade: String,
    val khaiGrade: String
)


