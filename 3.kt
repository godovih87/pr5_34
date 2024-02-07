fun main() {
    try{
        println("Введите возраст:")
        val a = readLine()!!.toInt()
        when{
            (a>=0 && a<=2)-> println("Младенец")
            (a>2 && a<=12)-> println("Детство")
            (a>12 && a<=18)-> println("Подросток")
            (a>18 && a<=35)-> println("Молодость")
            (a>35 && a<=60)-> println("Зрелость")
            (a>60)-> println("Пожилой")
            else-> println("Возраст введен не коректно")
        }
    }
    catch (e:Exception) {
        println("Введен символ")
    }
}