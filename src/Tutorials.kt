

fun main() {
//    println("Hello, World!")
//    println()
//    println("What's up")

    //----------------------------variable-------------------------------------

    var myVariable: Int = 5

    println("The value of our variable is: $myVariable")
    myVariable = 1
    println("The value is now: $myVariable")


// Kotlin: 'val' cannot be reassigned.
//    val myVariable2: Int = 5
//    println("The value of our variable is: $myVariable2")
//    // Kotlin: 'val' cannot be reassigned.
//    myVariable2 = 1
//    println("The value is now: $myVariable2")

    var myVariable3: Boolean = true

    println("The value of our variable is: $myVariable3")
    myVariable3 = false
    println("The value is now: $myVariable3")



    //------------------------------Arithmetic operators------------------------------

    val x = 15
    val y = 7
    val result = x + y

    println(result)

    var result2 = 15 + 7
    println(result2)

    println(15 + 7)
    println(15 / 7)

    var x1 = 20
    var y1 = 8

    println("The result of x + y is: ${x1 + y1}")

    val age = 45
    val favouriteNumber = 99
    println("I am $age years old and my favourite number is $favouriteNumber")


    // -----------------decimal numbers---------------------


    var x2: Float = 20.9f
    var y2 = 8F
    println("The result of x + y is: ${x2 + y2}")


    // -----------------String-----------------------------


    val string = "This is an example test"
    println("Out string is: ${string.toUpperCase()}")

    val string1 = "This is an 2 example test"
    println(string1.toUpperCase().reversed())


    // -----------------logical and comparison operators ---------------------

    val x3 = 5
    val y3 = 5

    val a = 6
    val b = 10

    println(x3 == y3 || a == b)
    println(!(x3 == y3) || a == b)
    println(x3 == y3 && a == b)



// ---------------------if conditions -----------------

    val x4 = 7
    val y4 = 7

    if(x4 < y4){
        println("x is lesser that y")
    } else if (x4 > y4){
        println("x is greater than y")
    }else{
        println("x is equal to y")
    }

    println("This will always be executed")

    //-------------------null values and user input  ------------------



    val userInput = readLine()
    println("You entered ${userInput?.toUpperCase()}")




}



