package RailwayTicketOffices
import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class RailwayTicketOffice (var numtrain: Int,var estinationstation: String, var traveltime: Int, var traveldate: String){
    open fun Station(){

        println("Введите название станции назначения:")
        estinationstation = readLine()!!.toString()
        while (true){
            if(estinationstation >= "а" && estinationstation <= "я"  || estinationstation >= "А" && estinationstation<= "Я") break
            else{
                println("Станция должна быть введена на руском языке: ")
                estinationstation = readLine()!!.toString()
            }
        }
    }
    open fun Time(){

        println("Введите время поездки в часах:")
        traveltime = readLine()!!.toInt()
        while (true){
            if(traveltime > 0) break
            else{
                println("Время поездки не может бытьотрицательным попробуйте ещё раз:")
                traveltime = readLine()!!.toInt()
            }
        }
    }
    open fun Date(){
        println("Введите даты поездки в формета dd.MM.yyyy:")
        traveldate = readLine()!!.toString()
        while (true){
            try {
                var list1 = traveldate.split('-')
                var dateFormatInput = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                val date1: LocalDate = LocalDate.parse(list1[0], dateFormatInput)
                var date1_string = date1.toString().replace('-', '.')
                traveldate = "${date1_string}"
                break
            }
            catch (e: Exception){
                println("Введите дату в правильном формате:")
                traveldate = readLine()!!.toString()
            }
        }
    }
    open fun Info() {
        println("Станция назначения: $estinationstation")
        println("Время поездки: $traveltime")
        println("Дата поездки: $traveldate")
        println("Идет поиск соответствующего поезда...")
        readLine()
    }
}