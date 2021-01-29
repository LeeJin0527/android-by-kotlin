package com.example.myapplication.kotlin


//변수 선언하는 방법
//var/val 변수명(상자) = 값(넣고 싶은 것)
//Variable -> 내 마음대로 원하는 것을 넣을수 있는 상자 /Value-> 한번 넣으면 바꿀 수 없다

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args: Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "good bye"
    point = 10.4


    println(num)
    println(hello)
    println(point)
    println(fix)

    //val 은 값을 바꿀 수 없다
    //fix = 500


}