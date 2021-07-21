fun reversedNumber (number : Long):List<String>{
    val num = number.toString()
    val arr = num.split("")
    return arr.reversed()
}

fun main(){
    println(reversedNumber(348597))
}