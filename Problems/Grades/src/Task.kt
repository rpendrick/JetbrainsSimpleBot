import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val totalGrades = scanner.nextInt()
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0


    repeat(totalGrades) {
        val grade = scanner.nextInt()
        when (grade) {
            5 -> gradeA++
            4 -> gradeB++
            3 -> gradeC++
            else -> gradeD++
        }
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}