import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val string1 = scanner.next(); val char1 = string1[0]
    val string2 = scanner.next(); val char2 = string2[0]
    val string3 = scanner.next(); val char3 = string3[0]
    val string4 = scanner.next(); val char4 = string4[0]
    println(string1 * 5)
    print(char1.isDigit())
    print("\\")
    print(char2.isDigit())
    print("\\")
    print(char3.isDigit())
    print("\\")
    print(char4.isDigit())
}
