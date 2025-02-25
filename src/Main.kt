class Snake(var snakeName: String?, var isVenomous: Boolean) {

    init {
        //output for snake name
        println("Snake details have been recorded: $snakeName")
    }
}

fun main() {

    val snakeList = mutableListOf("Cobra", "Viper", "Python", "Boa")
    //loop to allow for multiple snake entries
    while (true) {

        print("Enter a species of snake: ")
        val snakeSpecies: String? = readLine()
        //input validation
        if (snakeSpecies == null) {
            println("You did not enter any information")
            continue
        }

        print("Is this snake venomous? (yes/no): ")
        val isVenomous: String? = readLine()
        //creates snake object
        Snake(snakeSpecies, isVenomous == "yes")

        //adds snake to list
        snakeList.add(snakeSpecies)

        println("Would you like to add another snake? (yes/no)")
        val addSnake: String? = readLine()
        if (addSnake != "yes")
            break
    }
    //displays finalized snake list
    println("Current snakes list: ")
    for (snake in snakeList) {
        println("- $snake")
    }

    println("\nAdiosss")
}