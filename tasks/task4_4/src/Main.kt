// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: 3 temps required")
        exitProcess(1)
    }

    val startingTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val stepTemp = args[2].toDouble()

    val t = Terminal()
    val rows = mutableListOf<Pair<String, String>>()

    var currentTemp = startingTemp

    while (currentTemp < maxTemp) {
        val currentTempInFahrenheit = (currentTemp * 1.8) + 32
        rows.add(
            Pair(
                "%.2f".format(currentTemp),
                "%.2f".format(currentTempInFahrenheit)
            )
        )
        currentTemp = currentTemp + stepTemp
    }

    val tempTable = table {
        header {
            row("Celsius", "Fahrenheit")
        }
        body {
            column(0) {
                align = TextAlign.RIGHT
            }
            column(1) {
                align = TextAlign.RIGHT
            }

            for ((celsius, fahrenheit) in rows) {
                row(celsius, fahrenheit)
            }
        }
    }
    t.println(tempTable)
}
