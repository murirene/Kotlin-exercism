fun twofer( name: String = "" ):String {
    return "One for ${name}, one for me."
}

fun main() {
    val message:String = twofer("Alice")
    println(message)
}
