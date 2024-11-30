fun main() {

    // -------------11/30/24

//    val myArray = arrayOf(1, 2, 3)
//    for(i in myArray){
//        println(i)
//    }

//    for(i in 1..3){
//        println(i)
//    }

//    for(i in 10 downTo 5 step 2){
//        println(i)
//    }

//    for(i in 'a'..'z'){
//        println(i)
//    }

//    val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
//
//    var max = myArray[0]
//    for(i in myArray){
//        if(i > max){
//            max = i
//        }
//    }
//    println(max)


    //---------------------------

//    val list = mutableListOf<Int>()
//    println("Please enter 5 numbers: ")
//    for(i in 1..5){
//        val x = readLine()?.toInt()
//        if(x != null){
//            list.add(x)
//        }
//    }
//    println("The 5 numbers in reverse order are: ")
//    for(i in list.size - 1 downTo 0){
//        println(list[i])
//    }

    //------------------------------

    val list2 = mutableListOf(0, 1)
    println("Enter a number n > 1: ")
    val x2 = readLine()?.toInt()
    if(x2 != null){
        for(i2 in 2..x2-1){
            list2.add(list2[i2-2] + list2[i2-1])
        }
    }
    println(list2)




}