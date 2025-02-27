package com.example.ders_1

class TelephoneDetails(var brand:String,var model:String) {
    var batterycapacity=0
    constructor(brand: String,model: String,batterycapacity:Int):this(brand,model){
        this.batterycapacity=batterycapacity
    }
    fun phonedetails(){
        println("Brand:$brand")
        println("Model:$model")
        println("BatteryCapacity:$batterycapacity %")
    }
}
//burada hemcinin 0-a beraber etmekdense niye moterizede default qoymuruq?