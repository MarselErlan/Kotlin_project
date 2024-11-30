fun main() {

//    val array = arrayOf(1, 2, 3)
//    val list = mutableListOf(1, 2, 3)
//
////    array[0] = 3
////    list[0] = 3
//
//    // will add to the end
//    list.add(4)
//    list.remove(2)
//    list.add(5)
//    list.removeAt(0)
//    println(list)


    //----------------------

    val list2 = mutableListOf<Int>()
    for(i in 1..10){
        val x = readLine()?.toInt()
        if(x != null){
            list2.add(x)
        }
    }

    println(list2)


}