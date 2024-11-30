fun main() {

    //-------------------null values and user input  ------------------

//    val userInput = readLine()
//    println("You entered ${userInput?.toUpperCase()}")

    // integer Input
    val userInput = readLine()
    if(userInput != null){
        println(userInput.toInt() - 5)
    }

    //------------ enter your age

    println("Please enter your age: ")
    val age = readLine()?.toInt()

    if(age != null){
        if(age >= 0 && age < 18){
            println("You're not an adult yet")
        }else if(age >= 18 && age <= 65){
            println("You are an adult")
        }else{
            println("You are really really old")
        }
    }

}