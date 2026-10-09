// Task 4.2: use of if and ranges

fun main() {
    println("Would you like the mystery pizza a, b, c or d?: ")
    val choice = readln().lowercase()
    if (choice.length != 1 || choice[0] !in 'a'..'d') {
        println("Invalid Choice!")
    }
    else{
        println("Order Accepted!")
    }
}
