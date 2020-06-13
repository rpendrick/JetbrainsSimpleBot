import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val loLimit = scanner.nextInt()
    val hiLimit = scanner.nextInt()
    val actual = scanner.nextInt()

    println(if (actual < loLimit) {
        "Deficiency"
    } else if (actual > hiLimit) {
        "Excess"
    } else {
        "Normal"
    })
}