package com.example.myapplication.kotlin

fun main(args:Array<String>){
    val value : Int = 3
    when (value){
        1 -> {
            println("value is 1")
        }
        2-> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I don't know")
        }
    }

    if( value == 1){
        println("value is 1")
    }
    else if (value == 2){
        println("value is 2")
    }
    else if (value == 3){
        println("value is 3")
    }
    else{
        println("I don't know")
    }
    val value2 = when (value){ //switch -case 같은 느낌
        1-> 10
        2-> 20
        3-> 30
        else -> 100
    }
    println(value2)

}