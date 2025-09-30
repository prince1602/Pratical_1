class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDriven: Int
) {
    init {
        println("Object of class is created and Init is called.")
    }

    fun getOriginalPrice(): Double {
        return price
    }
    fun getCurrentPrice(): Double {
        val depreciation = milesDriven * 10   // ₹10 depreciation per mile
        return (price -depreciation).coerceAtLeast(0.0)
    }
    fun displayCarInfo() {
        println("----------")
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: ${getOriginalPrice()}")
        println("Current Car Price: ${getCurrentPrice()}")
        println("----------")
    }
}
fun main() {
    println("\nCreating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayCarInfo()

    println("\nCreating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayCarInfo()

    println("\n******* ArrayList of Car ***************")
    val cars = arrayListOf(
        Car("Toyota", 2017, 1080000.0, "KJS", 100),
        Car("Maruti", 2020, 4000000.0, "NPP", 200)
    )

    for (car in cars) {
        car.displayCarInfo()
    }
}