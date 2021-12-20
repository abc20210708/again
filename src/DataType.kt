
fun main() {

    val username: String = "Kildong"

    var username2: String
    username2 = "Test"

    var count: Int = 3

    //val은 불변형 변수 선언 키워드이므로
    //username은 불변현입니다.
   /// username = "Dolly"

    ///추론 타입 확인 : ctrl + shift + p

    ///var count = 3 //변하는 값 //다시 변경이 가능
    ///컴파일러 값에 따라 데이터형을 추론해 선언언

   println("username: $username, count: $count")

}