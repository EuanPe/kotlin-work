// Task 5.1.1: main program


fun main (args: Array<String>) {
    val word1 = args[0]
    val word2 = args[1]

    val result = anagrams(word1,word2)
    if (result){
        println("Is an anagram")
    }
    else {
        println("Not an anagram")
    }
    
}

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}