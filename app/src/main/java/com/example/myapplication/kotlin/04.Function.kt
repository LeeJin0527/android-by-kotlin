package com.example.myapplication.kotlin

//04.Function
//- 함수
//      - 어떤 input 을 넣으면 어떤 output 나옴
//      y = x + 2

// 함수를 선언하는 방법
//fun 함수명 ( 변수명 : 타입, 변수명 : 타입 ...) :반환형 {
//      함수내용
//      return 반환값
//}

fun plus(first: Int, second: Int): Int {
    // println(first)
    //println(second)
    val result: Int = first + second
    //println(result)
    return result
}

// -디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//-반환 값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)

}

fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)

}

//간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers : Int ){
    for (number in numbers){
        print (number)
    }
}

fun main(array: Array<String>) {
    val result = plus(5, 10)

    //  println(result)

    val result4 = plusFive(10, 20)
    println(result4)

    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20)

    val result6 = plusShort(50, 50)
    println(result6)

    plusMany(1)
}