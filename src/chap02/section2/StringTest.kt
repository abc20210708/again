package chap02.section2

fun main() {

    val str1: String = "Hello"
    val str2 = "World"
    val str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")

    println("str1 === str3: ${str1 === str3}")
    ///주소가 같은데 변수 이름이 다른 것!

    // == 값만 비교, === 참조까지 비교!


/*
    var로 선언된 str1의 참조 주소는 가변형으로 바뀔 수 있음
    (다른 것으로 지정이 가능)

    다만 일단 선언되 생성된 메모리 공간의 Hello는 변경되지 않음
    (변경 불가능)
* */

}