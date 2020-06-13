import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val y3 = scanner.nextInt()

    var l1 = listOf(x1, x2, x3)
    l1 = l1.sorted()
    var l2 = listOf(y1, y2, y3)
    l2 = l2.sorted()

    // println("${l1[0]} ${l1[1]} ${l1[2]}")
    // println("${l2[0]} ${l2[1]} ${l2[2]}")

    if (l1[0] == l2[0] && l1[1] == l2[1] && l1[2] == l2[2]) {
        println("Box 1 = Box 2")
    } else if (l1[0] <= l2[0] && l1[1] <= l2[1] && l1[2] <= l2[2]) {
        println("Box 1 < Box 2")
    } else if (l1[0] >= l2[0] && l1[1] >= l2[1] && l1[2] >= l2[2]) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable") }
}
