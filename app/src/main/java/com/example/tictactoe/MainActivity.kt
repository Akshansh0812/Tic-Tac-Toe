package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var flag : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            onclick(binding.btn1)
        }
        binding.btn2.setOnClickListener {
            onclick(binding.btn2)
        }
        binding.btn3.setOnClickListener {
            onclick(binding.btn3)
        }
        binding.btn4.setOnClickListener {
            onclick(binding.btn4)
        }
        binding.btn5.setOnClickListener {
            onclick(binding.btn5)
        }
        binding.btn6.setOnClickListener {
            onclick(binding.btn6)
        }
        binding.btn7.setOnClickListener {
            onclick(binding.btn7)
        }
        binding.btn8.setOnClickListener {
            onclick(binding.btn8)
        }
        binding.btn9.setOnClickListener {
            onclick(binding.btn9)
        }
    }

    private fun onclick(btn : Button) {
        if(btn.text == ""){
            if(!flag){
                flag = true
                btn.text = "X";
            }
            else{
                flag = false;
                btn.text = "0";
            }
        }
    }
}