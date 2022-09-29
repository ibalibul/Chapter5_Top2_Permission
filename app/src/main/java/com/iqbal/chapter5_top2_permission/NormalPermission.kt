package com.iqbal.chapter5_top2_permission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.iqbal.chapter5_top2_permission.databinding.ActivityNormalPermissionBinding

class NormalPermission : AppCompatActivity() {

    lateinit var binding : ActivityNormalPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  =  ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoadImage.setOnClickListener{
            Glide.with(this).load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.ivBinar)
        }
        binding.btnCheckStorage.setOnClickListener{

        }

    }
}