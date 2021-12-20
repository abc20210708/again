package chp04.section1

fun main() {

    val result: Int

    //val multi = { a: Int, b: Int -> a + b }
    val multi: (a: Int, b: Int) -> Int = {a, b -> a * b}
    /// {람다 함수에 사용할 매개변수 -> 반환할 식}

    result = multi(10, 20)
    println(result)
}