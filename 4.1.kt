fun main() {
    try{
        println("Введите x:")
        val x = readLine()!!.toInt()
        when{
            (x<=7)->println(-3*x+9)
            (x>7)-> println((1)/(x-7))
        }
        println("F(x)=$x")
    }
    catch (x: Exception){
    println("Введен символ")
    }
}