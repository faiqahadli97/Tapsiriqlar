package com.example.ders_1

class AutoDetails(var brand:String,var year:Int) {
    var color=" "
    constructor(brand: String,year: Int, color:String):this(brand,year){
        this.color=color}
        fun autodetail(){
            println("Brand:$brand")
            println("Year:$year")
            println("Color:$color")
        }

}