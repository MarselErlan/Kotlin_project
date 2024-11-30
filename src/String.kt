fun main() {

    // -----------------String-----------------------------

    val string = "This is an example test"
    println("Out string is: ${string.toUpperCase()}")

    val string1 = "This is an 2 example test"
    println(string1.toUpperCase().reversed())

    //----------------palindrome-----------------------
    var myString1 = "racecar"
    if(myString1.reversed() == myString1){
        println("The string $myString1 is a palindrome")
    }else{
        println("The string $myString1 is not a palindrome")
    }



}