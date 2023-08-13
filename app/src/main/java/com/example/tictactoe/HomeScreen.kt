package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityHomeScreenBinding

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener{

            val getPlayerOneName = binding.playerOne.text.toString()
            val getPlayerTwoName = binding.playerTwo.text.toString()

            if(binding.playerOne.text.isEmpty() || binding.playerTwo.text.isEmpty()){
                Toast.makeText(this, "Please Enter Player Names", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("playerOne", getPlayerOneName)
                intent.putExtra("playerTwo", getPlayerTwoName)
                startActivity(intent)
            }

        }
    }
}