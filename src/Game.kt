import java.awt.Choice

fun main() {
    var options = arrayOf("scissor", "paper", "rock")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoise(options)
    val getUserchoice = getUserChoise(options)
    val printResult = printResult(userChoice, gameChoice)
}
fun getGameChoice(options: Array<String>): String {
    return options[(Math.random() * options.size).toInt()]

}

fun getUserChoise(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //loop until the user enters a valid choice
    while (!isValidChoice) {
        //ask the user for their choice
        println("Please enter one of the following: Rock\n" + "Paper Scissors.”")
        for (item in options) {
            println("$item")}
            //read the user input

            var userInput = kotlin.io.readLine()
            //validate the userInput
            if (userInput != null && userInput in options) {
                isValidChoice = true
                userChoice = userInput
            }
            //if the choice is invalid ,inform the user
            if (!isValidChoice) {
                println("you must enter the valid choice")
            }

        }
    return userChoice

}






fun printResult(userChoice: String, gameChoice: String) {
    val result: String
//figure out the result
    if (userChoice == gameChoice) result = "tie!"
    else if ((userChoice == "Rock" && userChoice == "scissor") ||
        (userChoice == "paper" && gameChoice == "Rock") ||
        (userChoice == "scissors" && gameChoice == "paper")
    )
        result = "you win"
    else result = "you lose!"
    //print the result
    println("you chose $userChoice.I chose $gameChoice.$result")

}


