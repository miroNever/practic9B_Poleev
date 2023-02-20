import RailwayTicketOffices.*
class Sistem (numtrain:Int, var price: Int, estinationstation: String, traveltime: Int, traveldate: String) : RailwayTicketOffice(numtrain,estinationstation, traveltime, traveldate){

    public fun Num(){
        val num1 = (1000..6000).random()
        val num2 =(1000..6000).random()
        println("Номер поезда: $num1")
        println("Номер поезда: $num2")
        println("Введите номер поезда на котором поедете:")
        var numtrain = readLine()!!.toInt()
        while (true){
            if(numtrain == num1 || numtrain == num2) break
            else{
                println("неверно введён поезд попробуйте ещё раз:")
                numtrain = readLine()!!.toInt()
            }
        }
        when{
            (numtrain == num1) -> println("Ваш номер поезда $numtrain")
            (numtrain == num2) -> println("Ваш номер поезда $numtrain")
        }
    }
    public fun PriceTravel(){
        println("К оплате: $price руб.")
    }
}