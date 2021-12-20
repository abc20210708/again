package chap02.section3

fun main() {

    //Kotlin에서는 기본적으로 Notnull이고 Nullable 표현에만
    //'?'가 사용된다

    var str1:String?
    str1 = "Hello"


    val len = str1?.length ?: -1
    //var len = if (str1 != null) str1.length else -1
    //alt + enter -> elvis 엘비스 표현식으로 바꾸기

    println("str1 = ${str1}, length: ${len}")

    println("str1 = ${str1}, length: ${str1?.length}")
    //println("str1 = ${str1}, length: ${str1!!.length}")
    /// Safe-call 기호 ?. str1이 null이면 뒷부분 length를 실행하지 않음
    /// str1에 "Hello"를 넣으면 length는 5

    //!! non-null 단정 기호 ,널이 아닐꺼라고 단정해서 컴파일러가 오류를 무시하도록


}