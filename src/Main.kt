class Snake(var snakeName: String?, var isVenomous: Boolean) {

    init {

        println("Snake details have been recorded: $snakeName")
    }
}

fun main() {

    val snakeList = mutableListOf("Cobra", "Viper", "Python", "Boa")

    while (true) {

        print("Enter a species of snake: ")
        val snakeSpecies: String? = readLine()

        if (snakeSpecies == null) {
            println("You did not enter any information")
            continue
        }

        print("Is this snake venomous? (yes/no)")
        val isVenomous: String? = readLine()


        snakeList.add(snakeSpecies)

        println("Would you like to add another snake? (yes/no)")
        val addSnake: String? = readLine()
        if (addSnake != "yes")
            break
    }

    println("Current snakes list: ")
    for (snake in snakeList) {
        println("- $snake")
    }

    println("\nAdiosss")
}