package com.example.ders_1

class House(var adress:String,var rooms:Int) {
    var price=0.0
    constructor(adress: String,rooms: Int,price:Double):this(adress,rooms){
        this.price=price}

        fun houseInfo() {
            println("Adress:$adress")
            println("Rooms:$rooms")
            println("Price:$price")
        }

}

//burdada hemcinin standart default olaraq 0 yazmaq olmaz mi?