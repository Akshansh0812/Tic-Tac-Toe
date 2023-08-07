package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var flag : Boolean = false
    private lateinit var winner : CharSequence
    private  var count : Int = 0
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
            count++
            if(!flag){
                flag = true
                btn.text = "X";
            }
            else{
                flag = false;
                btn.text = "0";
            }
        }
        win()
    }

    private fun win() {
        val b1 = binding.btn1.text;
        val b2 = binding.btn2.text;
        val b3 = binding.btn3.text;
        val b4 = binding.btn4.text;
        val b5 = binding.btn5.text;
        val b6 = binding.btn6.text;
        val b7 = binding.btn7.text;
        val b8 = binding.btn8.text;
        val b9 = binding.btn9.text;

        if(b1 == b2 && b2 == b3 && b3 != ""){
            toast("winner is : $b1")
            newGame()
        }
        else if(b4 == b5 && b5 == b6 && b6 != ""){
            toast("winner is : $b4")
            newGame()
        }
        else if(b7 == b8 && b8 == b9 && b9 != ""){
            toast("winner is : $b7")
            newGame()
        }
        else if(b1 == b4 && b4 == b7 && b7 != ""){
            toast("winner is : $b1")
            newGame()
        }
        else if(b2 == b5 && b5 == b8 && b8 != ""){
            toast("winner is : $b2")
            newGame()
        }
        else if(b3 == b6 && b6 == b9 && b9 != ""){
            toast("winner is : $b3")
            newGame()
        }
        else if(b1 == b5 && b5 == b9 && b9 != ""){
            toast("winner is : $b1")
            newGame()
        }
        else if(b3 == b5 && b5 == b7 && b7 != "") {
            toast("winner is : $b3")
            newGame()
        }
        else if(count == 9){
            toast("Draw")
            newGame()
        }
    }

    private fun newGame() {
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""

    }

    private fun toast(text: String) {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }

}