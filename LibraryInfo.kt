package com.example.ders_1

class LibraryInfo(var name:String,var location:String) {
    var number0fBooks=0
    constructor(name: String,location: String,number0fBooks:Int):this(name,location){
        this.number0fBooks=number0fBooks}
        fun Libraryinfo(){
            println("Name:$name")
            println("Location:$location")
            println("Number books:$number0fBooks")
        }

}