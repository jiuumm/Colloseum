package com.example.colloseum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.colloseum.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupEvents()
        setValues()



    }  override fun setupEvents() {

    }

    override fun setValues() {

    }


}
