package chap03.section1

fun normalVarargs(vararg counts: Int) {
    for(num in counts) {
        print("$num ")
    }
    println("\n")
}

fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}