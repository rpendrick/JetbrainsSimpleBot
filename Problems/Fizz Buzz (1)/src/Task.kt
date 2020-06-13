import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val lo = scanner.nextInt()
    val hi = scanner.nextInt()
    for (i in lo..hi) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}