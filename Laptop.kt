package com.example.ders_1

class Laptop(var brand: String, var price: Double) {
    fun discountedPrice():Double {
        return price * 0.9
    }
}