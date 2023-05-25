package com.strength.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.strength.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var myInfo : MyInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        myInfo = MyInfo("Shubham Singh", "Hi, My good name is Shubham Singh. I am graduated from IGNOU (Indira Gandhi National Open University) in programme BCA (Bachelor of Computer Application). I like to make computer applications which works on various devices and solve people's problems. I am not very outgoing person but i like to play with my friends indoor and outdoor both. I have made this application for my description to show to anyone who is from Information Technology background and understand what i have been my motive behind it. Simply that it is my introduction or my bio for a person to read about me.")

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.myInfo = myInfo
    }
}