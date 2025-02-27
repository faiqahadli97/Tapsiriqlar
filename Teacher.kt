package com.example.ders_1

class Teacher(var name:String,var subject:String) {
    var experience=0
    constructor(name: String,subject: String,experience:Int):this(name,subject){
        this.experience=experience
    }

    fun getinfo(){
        println("Name: $name")
        println("Subject: $subject")
        println("Experience: $experience")
    }
}

//4setrde experience'ye 0 qiymet verib beraber etmekdense niye employedeki kimi 0 qiymeti vermedik default olaraq.?