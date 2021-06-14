package com.example.mvp.presenter

import android.util.Log
import com.example.mvc.model.MainService
import com.example.mvp.BuildConfig
import com.example.mvp.view.MainView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainPresenterImpl(private val mainView: MainView) : MainPresenter {

    override fun callItem(stationName :String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val info = MainService.retrofitService.listAir(
                    BuildConfig.airKoreaKey,
                    "json",
                    2,
                    1,
                    stationName,
                    "DAILY",
                    1.0
                ).body()!!.response.body.items[0]
                mainView.showResult(info)
            } catch (e: Exception) {
                Log.e("network error", e.toString())
            }
        }
    }
}