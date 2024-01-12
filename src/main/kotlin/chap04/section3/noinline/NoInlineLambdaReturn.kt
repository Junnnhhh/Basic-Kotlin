package chap04.section3.noinline

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline을 제거
     out(a, b)
}

fun retFunc() {
    println("start of refFunc")
    inlineLambda(13, 3) lit@ { a, b -> // 람다식 블록의 시작 부분에 라벨을 저장
        val result = a + b
        if(result > 10) return@lit // 라베을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // 이 부분으로 빠져나감
    println("end of retFunc") // 이 부분이 실행
}