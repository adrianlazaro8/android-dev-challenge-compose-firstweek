package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.entities.Dog

class DogDataSource {

    fun getDogs(): List<Dog> {
        return localDogs()
    }

    private fun localDogs(): List<Dog> {
        return listOf(
            Dog(
                0,
                "Puppi",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
                1,
                "Black",
                R.drawable.sample_3,
            ),
            Dog(
                1,
                "Doggy",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
                4,
                "White",
                R.drawable.sample_4,
            ),
            Dog(
                2,
                "Terminator",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
                2,
                "Brown",
                R.drawable.sample_5,
            ),
            Dog(
                3,
                "Biute",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
                5,
                "White",
                R.drawable.sample_1,
            ),
            Dog(
                4,
                "Androidy",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
                3,
                "White",
                R.drawable.sample_2,
            )
        )
    }
}