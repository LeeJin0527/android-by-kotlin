package com.example.myapplication.kotlin



var a = 1 + 2 + 3 + 4 + 5 //연산의 결과값을 변수에 넣어줄 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John "
var f = "My name is $e Nice to meet you"

//Null
//- 존재 하지 않는다

//var abc : Int = null
//자료형 뒤에 물음표 ->null을 가질수 있다

var abc1 : Int? = null // "null" (x)
var abc2 : Double? = null

var g = a + 3

fun main(arr: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)


}

