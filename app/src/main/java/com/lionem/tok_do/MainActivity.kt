package com.lionem.tok_do

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.lionem.tok_do.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initView()
        initToDoList()
    }

    private fun initView() {
        binding.buttonAdd.setOnClickListener {
            startActivity(Intent(this, EditToDoActivity::class.java))
        }
    }

    private fun initToDoList() {

    }
}