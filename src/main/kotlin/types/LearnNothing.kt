package types
fun main(args: Array<String>) {

    //Unit
    var number = if(System.currentTimeMillis() < 5000){
        30
    }else{
        failUnit("you run out of the time...")
    }

    //type of number is Any
    println(number)

    //Using Nothing
    var data = if( System.currentTimeMillis() < 5000){
        43
    }else{
        fail("you run out of the time...")
    }

    //type of data is always Int
    println(data)
}

fun fail(message: String): Nothing{
    throw IllegalStateException(message)
}

fun failUnit(message: String){
    //do some stuff
}

