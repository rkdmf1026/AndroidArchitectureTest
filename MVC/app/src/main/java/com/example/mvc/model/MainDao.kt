package com.example.mvc.model

//data class MainDao(val totalCount : Int, val items : List<item>)
data class body(val totalCount: Int, val items: List<item>, val pageNo : Int, val numOfRows : Int)
data class item(val dataTime : String,
                val so2Value : String,
                val coValue : String,
                val o3Value : String,
                val no2Value : String,
                val pm10Value : String,
                val pm25Value : String,
                val khaiValue : String,
                val so2VGrade : String,
                val coGrade : String,
                val o3Grade : String,
                val no2Grade : String,
                val pm10Grade : String,
                val pm25Grade : String,
                val khaiGrade : String)


