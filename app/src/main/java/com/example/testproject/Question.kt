package com.example.testproject

class Question(val correctOption: String,
               val incorrectOption: String)  {
    var answeredOption: String? = null

    fun answer(option: String): Boolean {
        answeredOption = option

        return correctOption == answeredOption
    }
}