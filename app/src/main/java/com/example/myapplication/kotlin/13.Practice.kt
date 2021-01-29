package com.example.myapplication.kotlin

fun main(array: Array<String>){
    val array = arrayOf<Int>(1,2,3)

    //get,set
    var number = array.get(0)
    println(number)

    array.set(0,100)
    val number2 = array.get(0)
    println(number2)
    //array.set(100,100)
    //Array의 바운드는 처음 만들때 결정된다

    //Array 만드는 방법
    var a1 = intArrayOf(1,2,3)
 //   var a2 = intArrayOf("hello")
    var a3 = charArrayOf('b','c')
    var a4 = doubleArrayOf(1.2)

    // (4)
    var a5 = Array(10,{ 0 }) //lambda
    var a6 = Array(5, {1;2;3;4;5}) //lambda is semicolon

}


