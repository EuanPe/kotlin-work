// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")
    filePath.writeText("HELLO TO LEEDS UNIVERSITY\n")
    filePath.appendText("I AM YOUR LEADER")

    val text = filePath.readText()
    print(text)
}
