fun main() {
    try{
        println("Введите трех заначное число")
        val b = readLine()!!.toInt()
    when {
        (b/100==b%10)-> println("Число $b палиндром")
        else-> println("Число $b не палиндром")
    }
    }
    catch (b: Exception){
        println("Введен символ")
    }
}