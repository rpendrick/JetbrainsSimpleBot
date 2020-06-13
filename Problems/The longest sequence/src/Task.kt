import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val sizeOfInput = scanner.nextInt()
    var count = 1
    var bestCount = 1
    var first = scanner.nextInt()
    for (i in sizeOfInput downTo 2) {
        val compare = scanner.nextInt()
        if (compare >= first) {
            count++
            if (count > bestCount) {
                bestCount = count
            }
        } else {
            count = 1
        }
        first = compare
    }
    println(bestCount)
}