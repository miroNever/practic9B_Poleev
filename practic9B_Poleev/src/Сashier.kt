import RailwayTicketOffices.*

open class Сashier (var intermediatestations: Int,var startingstation: String,numtrain:Int,var price: Int,estinationstation: String, traveltime: Int, traveldate: String): RailwayTicketOffice(numtrain,estinationstation, traveltime, traveldate) {
    public fun SetInfo(){
        println("введиет кол-во промежуточных станций по маршруту ($startingstation - $estinationstation):")
        intermediatestations = readLine()!!.toInt()
        while (true){
            if(intermediatestations > 0) break
            else{
                println("Кол-во станций не может быть меньше или равно 0, попробуйте ещё раз:")
                intermediatestations = readLine()!!.toInt()
            }
        }
        while (intermediatestations != 0){
            price -= 250
            println("Цена за $intermediatestations промедуточную станцию равна $price")
            intermediatestations -= 1
        }
    }
}