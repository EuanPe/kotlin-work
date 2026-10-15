// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: filename required as sole argument")
        exitProcess(1)
    } else {
        val mark1 = args[0].toInt()
        val mark2 = args[1].toInt()
        val mark3 = args[2].toInt()

        val mark = (mark1 + mark2 + mark3) / 3.0
        val mark_rounded = mark.roundToInt()
        val grade = when (mark_rounded) {
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "Invalid"
        }

        println("Rounded average: $mark_rounded, Grade: $grade")
    }
}