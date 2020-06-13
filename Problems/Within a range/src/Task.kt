import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val lowRange1 = scanner.nextInt()
    val highRange1 = scanner.nextInt()
    val lowRange2 = scanner.nextInt()
    val highRange2 = scanner.nextInt()
    val number = scanner.nextInt()

    println(number in lowRange1..highRange1 || number in lowRange2..highRange2)
    // write your code here
}