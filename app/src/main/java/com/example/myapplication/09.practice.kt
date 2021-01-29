package com.example.myapplication

fun main(args: Array<String>){

    val a :Int? = null
    val b : Int = 10
    val c: Int = 100

    if (a == null){
        println("a는 null")
    }
    else{
        println("a is not null")
    }
    if (b + c ==110 ){
        println("b + c is 110")
    }
    else{
        println("no")
    }

    //elvis

    val number :Int? = 100
    val number2 = number ?: 10 //null 이면 10 넣고 아니면 number 대입


    println(number2 )

}