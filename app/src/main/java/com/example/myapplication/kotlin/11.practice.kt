package com.example.myapplication.kotlin

fun main (args: Array<String>){
    val value :Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }
        val value2 : Boolean ? = null
        when (value2){
            true -> {
                println("a")
            }
            false -> {
                println("b")
            }
            null -> {
                println(null)
            }
        }
    //값을 return 하는 when 구문은 반드시 값을 리턴해야한다
    var value3 = when (value2){
        true -> 1
        false -> 3
        null -> 2
    }

    //when 의 다양한 조건식
    val value4 :Int = 10
    when (value4){
        is Int -> {
            println("value is Int ")
        }
        else -> {
            println("value is not Int ")

        }
    }

    //when 의 다양한 조건식 (2)
    val value5 : Int = 70
    when (value5){
        in 60.. 70 -> {
            println("6-7")
        }
        in 70..80 ->{
            println("7-8")
        }
        in 80.. 90->{
            println("8-9")
        }
    }
}