package com.example.mvc.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import com.example.mvc.databinding.ActivityMainBinding
import com.example.mvc.model.MainService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.stationName.text = Editable.Factory.getInstance().newEditable("종로구")


        binding.btnSearch.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    val info = MainService.retrofitService.listAir(
                        com.example.mvc.BuildConfig.airKoreaKey,
                        "json",
                        2,
                        1,
                        binding.stationName.text.toString(),
                        "DAILY",
                        1.0
                    ).body()!!.response.body.items[0]
                    binding.pm10.text = info.pm10Value
                    binding.pm10Grade.text = info.pm10Grade

                } catch (e: Exception) {
                    Log.e("network error", e.toString())

                }
            }





        }


    }
}
