// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, text: String, redactionChar: Char = 'X'): String {
    return document.replace(text, redactionChar.toString().repeat(text.length))
}