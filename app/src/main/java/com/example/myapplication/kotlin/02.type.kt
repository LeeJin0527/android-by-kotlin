package com.example.myapplication.kotlin

//02.자료형
//정수형 -> Long > Int> Short > Byte
//실수형 -> Double > Float
//문자 -> Char
//문자열 -> String
//논리형(참 True /거짓 False) ->Boolean

var number = 10
fun main(array:Array<String>){
    number = 20
    //number의 type과 맞지 않다
    //number = 20.5

    //변수 선언하는 방법2
    //var/val 변수 : 자료형 = 값
    var number1 : Int = 20
    var Hello1 :String ="Hello"
    var point1 :Double = 3.3

    //Variable or Value??
    // -1. 변하지 않는 값이라면 Value
    // -2. 이 값이 앞으로 변할지 안변할지 모르겟다 ->Value
}