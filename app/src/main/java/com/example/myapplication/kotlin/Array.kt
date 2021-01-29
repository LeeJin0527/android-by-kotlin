package com.example.myapplication.kotlin

fun main(array:Array<String>){
    //배열 생성

    var number :Int = 10
    var group1 = arrayOf<Int>(1,2,3,4,5)

    //println(group1 is Array)
    var number1 = 10
    var group2 = arrayOf(1,2,3.5,"hello")
    println(group2 is Array)


    //배열의 값을 꺼내는 방법
    val test1 = group1.get(4)
    println(test1)

    //배열의 값을 꺼내는 방법
    val test3 = group1[0]
    println(test3)
    group1.set(0,100)
    println(group1[0])

    group1[0] = 200
    println(group1[0])
}