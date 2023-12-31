package chap03.section3

fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y}, 10, 20) // 람다식을 매개변수와 인자로 사용한 함수
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}