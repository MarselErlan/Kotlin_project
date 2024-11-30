fun main() {

    //---------------------11/30/24

    var x = 3

    while(x > 0){
        println("hello")
        x--
    }
    println("whats up?")

    //----------------------

    println("Please enter a number")

    var x2 = readLine()?.toInt()
    println("Lets count from $x2 down to 0:")

    while (x2 != null && x2 >= 0 ){
        println(x2)
        x2--
    }

    //-------------------------

    println("Enter number 1: ")
    var x3 = readLine()?.toInt()
    println("Enter number 2: ")
    var y3 = readLine()?.toInt()

    var result = 1
    var i3 = 0
    while (x3 != null && y3 != null && i3 < y3) {
        result *= x3
        i3++
    }
    println("$x3 to the power of $y3 is $result")


}