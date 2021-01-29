package com.example.myapplication.kotlin

//08.제어흐름

fun main(args: Array<String>){

    val a :Int = 5
    val b :Int = 10

   /* if (a > b){
        println("A가 b보다 크다 ")
    }
    else{
        println("A가 b보다 작다 ")
    }
    println(3);
    */
    if(a > b){
        println("A가 b보다 크다 ")
    }
    if (a > b) {
        println("A가 b보다 크다 ")
    }else if ( a< b){
        println("A가 b보다 작다 ")
    }

    else{
        println("A== b")
    }
    //값을 리턴하는 if 사용법

    val max = if(a > b) a else b

    println(max)

}