package com.example.ders_1

fun main() {
    var laptop = Laptop("Apple", 1000.0)
    println("Original price: ${laptop.price}")
    println("10% price:${laptop.discountedPrice()}")
}
