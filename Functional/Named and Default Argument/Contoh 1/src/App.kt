// main function
fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun contoh (valueA: Int) : Int {
    val a = 5 + 3
    return a
}