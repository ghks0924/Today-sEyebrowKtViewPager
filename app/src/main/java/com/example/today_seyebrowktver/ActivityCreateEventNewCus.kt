package com.example.today_seyebrowktver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.today_seyebrowktver.databinding.ActivityCreateEventNewCusBinding

class ActivityCreateEventNewCus : ActivityBase() {

    //viewBinding
    private lateinit var binding: ActivityCreateEventNewCusBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateEventNewCusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setLayout()
    }

    private fun setLayout() {
        mChangeStatusBarColor("#ebbdc5")
    }

}