package com.example.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.presenter.MainPresenterImpl
import com.example.mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainPresenter: MainPresenter by lazy { MainPresenterImpl(MainViewImpl(binding)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btnSearch.setOnClickListener {
            mainPresenter.callItem(binding.stationName.text.toString())
        }
    }

}