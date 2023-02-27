import RailwayTicketOffices.RailwayTicketOffice

fun main(){
    var passenger = RailwayTicketOffice(0,"", 0, "")
    passenger.Station()
    passenger.Time()
    passenger.Date()
    passenger.Info()
    var sistem = Sistem(0, 5645, "", 0, "")
    sistem.Num()
    sistem.PriceTravel()
    var cashier = Сashier(0, "Москва", 0, sistem.price, passenger.estinationstation, passenger.traveltime,passenger.traveldate)
    cashier.SetInfo()
}