import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello: ${args[0]} and ${args[1]}! Kotlin")
    dayOfWeek()
}

fun dayOfWeek() {
    println("\nWhat day of the week is today?\n")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}