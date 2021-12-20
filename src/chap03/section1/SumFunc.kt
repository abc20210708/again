package chap03.section1

fun sum(a: Int, b: Int = 5): Int {
    return a + b
} //최상위 함수
///fun sum(a: Int, b: Int) = a + b

/*
    최상위 함수 특징: sum이라는 이름은 main의 위 혹은 아래에 두더라고
                    해당 이름은 main 안에서 사용할 수 있어요
* */

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

///fun max(a: Int, b: Int) = if (a > b) a else b

fun outfunc(name: String): Unit {
    println("Name: $name")
    //return Unit이 생략되어 있음!
}

///fun outfunc(name: String) =  println("Name: $name")

fun main() { //최상위 함수 (Top-level) 함수

    val result1 = sum(2,3)
    val result3 = sum(2)

    val a = 3
    val b = 5 //val a,b 와 fun max(a: Int, b: Int)의 a,b는 다름

    //값이 매개변수에 복사되어 사용된다고 이해하면 좋습니다.

    val result2 = max(a, b)

    outfunc("kildong")

    println("$result1")
    println("$result2")
    println("$result3")

}



