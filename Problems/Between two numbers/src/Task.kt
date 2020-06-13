import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val lowRange = scanner.nextInt()
    val highRange = scanner.nextInt()

    println(number in lowRange..highRange)
}