package com.example.ders_1

class Employee(var name:String,var position:String,var salary:Double) {
    constructor(name: String,position: String):this(name,position,1000.0)

    fun displayinfo(){
        println("Name:$name")
        println("Position:$position")
        println("Salary:$salary")
    }
}