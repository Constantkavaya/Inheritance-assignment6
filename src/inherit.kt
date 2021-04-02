

fun main() {
    var vehicles=Car("subaru","legacy","white",4)
    vehicles.carry(8)
    vehicles.identity()
    println(vehicles.parkingFees(6))

    var bus=Bus("scania","schoolbus","yellow",60)
    bus.identity()
    bus.carry(34)
    bus.carry(90)
    println(bus.parkingFees(6))

}

open class Vehicles(var make:String,var model:String,var color:String,var capacity:Int) {
    fun identity() {
        println("I am a $color $make $model")

    }
    fun carry(people: Int) {
        if (capacity >= people) {
            println("carrying$people passengers");

        } else if (capacity >= people) {
            var exceed = people - capacity
            print("over capacity$exceed passenger")
        }
    }
    open fun parkingFees(hours: Int): Int {
        var parkingfees = hours*20
        return parkingfees

    }
}

class Car(make: String, model: String, color: String, capacity: Int) : Vehicles(make, model, color, capacity) {

    }

    class Bus(make: String, model: String, color: String, capacity: Int) : Vehicles(make, model, color, capacity) {


        fun maxTripfare(fare: Double): Double {
            var times = fare * capacity
            return times
        }
        override fun parkingFees(hours: Int): Int {
            var parkingfees=hours*capacity
            return parkingfees
        }


    }




