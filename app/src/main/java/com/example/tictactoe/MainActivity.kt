package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var flag : Boolean = false
    private var count:Int = 0
    private lateinit var playerOneName : Any
    private lateinit var playerTwoName : Any
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.playerOne.text = intent.getStringExtra("playerOne")
        binding.playerTwo.text = intent.getStringExtra("playerTwo")

        playerOneName = binding.playerOne.text
        playerTwoName = binding.playerTwo.text

        binding.playerTwoLayout.setBackgroundResource(R.drawable.round_back_dark_blue)
        binding.playerOneLayout.setBackgroundResource(R.drawable.round_back_blue_border)

        binding.startAgain.setOnClickListener{
            newGame()
        }

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



    private fun onclick(btn : ImageView) {

        if(btn.drawable == null){
            count++
            if(!flag){
                flag = true

                binding.playerTwoLayout.setBackgroundResource(R.drawable.round_back_blue_border)
                binding.playerOneLayout.setBackgroundResource(R.drawable.round_back_dark_blue)
                btn.setImageResource(R.drawable.cross_icon)
                win(playerOneName)
            }
            else{
                flag = false;
                binding.playerTwoLayout.setBackgroundResource(R.drawable.round_back_dark_blue)
                binding.playerOneLayout.setBackgroundResource(R.drawable.round_back_blue_border)
                btn.setImageResource(R.drawable.zero_icon)
                win(playerTwoName)
            }
        }
    }

    private fun win(playerName: Any?) {
        val b1 = binding.btn1.drawable
        val b2 = binding.btn2.drawable
        val b3 = binding.btn3.drawable
        val b4 = binding.btn4.drawable
        val b5 = binding.btn5.drawable
        val b6 = binding.btn6.drawable
        val b7 = binding.btn7.drawable
        val b8 = binding.btn8.drawable
        val b9 = binding.btn9.drawable

        if(b1?.constantState == b2?.constantState && b2?.constantState == b3?.constantState && b3 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b4?.constantState == b5?.constantState && b5?.constantState == b6?.constantState && b6 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b7?.constantState == b8?.constantState && b8?.constantState == b9?.constantState && b9 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b1?.constantState == b4?.constantState && b4?.constantState == b7?.constantState && b7 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b2?.constantState == b5?.constantState && b5?.constantState == b8?.constantState && b8 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b3?.constantState == b6?.constantState && b6?.constantState == b9?.constantState && b9 != null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b1?.constantState == b5?.constantState && b5?.constantState == b9?.constantState && b9!= null){
            toast("winner is : $playerName")
            newGame()
        }
        else if(b3?.constantState == b5?.constantState && b5?.constantState == b7?.constantState && b7 != null) {
            toast("winner is : $playerName")
            newGame()
        }
        else if(count == 9){
            toast("Match is draw");
            newGame()
        }
    }

    private fun newGame() {
        binding.btn1.setImageResource(R.drawable.image_button_bg)
        binding.btn2.setImageResource(R.drawable.image_button_bg)
        binding.btn3.setImageResource(R.drawable.image_button_bg)
        binding.btn4.setImageResource(R.drawable.image_button_bg)
        binding.btn5.setImageResource(R.drawable.image_button_bg)
        binding.btn6.setImageResource(R.drawable.image_button_bg)
        binding.btn7.setImageResource(R.drawable.image_button_bg)
        binding.btn8.setImageResource(R.drawable.image_button_bg)
        binding.btn9.setImageResource(R.drawable.image_button_bg)

        binding.playerTwoLayout.setBackgroundResource(R.drawable.round_back_dark_blue)
        binding.playerOneLayout.setBackgroundResource(R.drawable.round_back_blue_border)
        count = 0
        flag = false

    }

    private fun toast(text: String) {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }

}