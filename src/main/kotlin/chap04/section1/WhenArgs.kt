package chap04.section1

fun main() {
    print("enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0 .. 80.0 -> grade = 'C'
        !in 70.0 .. 100.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}