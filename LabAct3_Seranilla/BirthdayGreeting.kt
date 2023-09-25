var age = 21
var name = "Marco"
val border = "%%%===%%%"
val timesToRepeat = 3

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun main() {
    printBorder(border, timesToRepeat) // Pass the 'border and times to repeat' variable as an argument
    print("Happy birthday, ${name}\n")
    printBorder(border, timesToRepeat) // Pass the 'border and times to repeat' variable as an argument
    print("I am ${age * 365} days old\n")
    print("${age * 365} days old is the best age to learn Kotlin!\n")
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    println("$name is ${age * 365} days old")
}
