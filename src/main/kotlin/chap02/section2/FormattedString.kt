package chap02.section2

fun main() {
    val num = 10
    val formattedString = """
       var a = 6
       var b = "Kotiln"
       println(a + num) // num의 값은 $num
    """

    println(formattedString)
}