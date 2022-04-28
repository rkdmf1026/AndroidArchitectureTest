package com.example.mvvm.viewmodel

import android.util.Log
import androidx.databinding.ObservableField
import com.example.mvc.model.MainService
import com.example.mvc.model.item
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel {
    val item = ObservableField<item>()
    val stationName = ObservableField<String>()

    fun callItem() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val info = MainService.retrofitService.listAir(
                    com.example.mvvm.BuildConfig.airKoreaKey,
                    "json",
                    2,
                    1,
                    stationName.get().toString(),
                    "DAILY",
                    1.0
                ).body()!!.response.body.items[0]
                item.set(info)
            } catch (e: Exception) {
                Log.e("network error", e.toString())

            }
        }
    }
}