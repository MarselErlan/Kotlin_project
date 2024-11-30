fun main() {

    var myArray = arrayOf("hello", "guys", "whats up?")
    println(myArray[0])

    //--------------------

    val myArray2 = arrayOf(4, 3, 5, 6, 8, 1)
    var sum = 0

    for(i in myArray2){
        sum += i
    }
    println("The sum of the array is $sum")


    //-----------------------------

    println("Enter 5 numbers:")

    var avg = 0.0
    for(i in 1..5){
        var input = readLine()?.toInt()
        if(input != null){
            avg += input / 5.0
        }
    }
    println("The average value is $avg")


}