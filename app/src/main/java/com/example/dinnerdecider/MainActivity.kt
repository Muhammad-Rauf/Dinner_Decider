package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val foodlist= arrayListOf("Chinese Rice ","Biryani","Burger"," Pizza")
    lateinit var runtimefood: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var selectedfoood:TextView=findViewById(R.id.selectedfoodTextid)
        var newfood:EditText=findViewById(R.id.editTextfoodid)
       // selectedfoood.text="Burger King"
        var deciderbtn:Button=findViewById(R.id.deciderbtnid)


        deciderbtn.setOnClickListener{
            val random= java.util.Random()
            val randomFood=random.nextInt(foodlist.count())
            selectedfoood.text=foodlist[randomFood]

        }
        var addFoodBtn:Button=findViewById(R.id.addfoodbtnid)
        addFoodBtn.setOnClickListener{
           // runtimefood= newfood.getText().toString()
            runtimefood= newfood.text.toString()
            foodlist.add(runtimefood)
            newfood.text.clear()
        }

    }
}