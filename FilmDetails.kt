package com.example.ders_1

class FilmDetails(var tittle:String,var director:String) {
    var relaeseyear=0
    constructor(tittle: String,director: String,relaeseyear:Int):this(tittle,director){
        this.relaeseyear=relaeseyear}
        fun showmovieinfo(){
            println("Tittle:$tittle")
            println("Director:$director")
            println("RelaeseYear:$relaeseyear")
        }

}