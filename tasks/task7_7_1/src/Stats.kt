// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    val sorted = data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    } else {
        sorted[middle]
    }
}

fun displayStatistics(data: List<Float>) {
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}