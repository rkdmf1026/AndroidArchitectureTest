package com.example.mvp.view

import android.view.View
import com.example.mvc.model.item
import com.example.mvp.databinding.ActivityMainBinding

class MainViewImpl(private val binding : ActivityMainBinding) : MainView{
    override fun showResult(item: item) {
        binding.textTime.text = item.dataTime.toString()
        binding.pm10.text = item.pm10Value
        binding.pm10Grade.text = item.pm10Grade
    }
}