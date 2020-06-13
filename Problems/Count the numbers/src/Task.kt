import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var lo = scanner.nextInt()
    val hi = scanner.nextInt()
    val divisor = scanner.nextInt()
    var count = 0

//    for (i in lo..hi) {
//        if (i % divisor == 0) count++
//    }

    if (lo < divisor) {
        lo = divisor
    }
    count = (hi - lo) / divisor + 1

    println("$count")
}