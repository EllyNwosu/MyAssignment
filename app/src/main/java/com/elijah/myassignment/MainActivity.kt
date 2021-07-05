package com.elijah.myassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elijah.myassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var letterAdapter: LetterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val songs : List<LetterModel> = listOf(
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),
            LetterModel(
                FirstName = "John", SecondName = "Wick"
            ),

            myLetterAdapter = LetterAdapter(name)
        binding.recyclerView.adapter = myLetterAdapter

    }
}