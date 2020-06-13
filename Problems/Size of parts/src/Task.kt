import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputItems = scanner.nextInt()
    var fixCount = 0
    var rejectCount = 0
    var perfectCount = 0
    repeat(inputItems) {
        val item = scanner.nextInt()
        when (item) {
            1 -> fixCount++
            -1 -> rejectCount++
            else -> perfectCount++
        }
    }
    println("$perfectCount $fixCount $rejectCount")
}