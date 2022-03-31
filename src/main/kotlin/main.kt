package ru.netology

fun main() {
    val itemPrice = 100
    var song = 120
    val musicLover = false
    val totalPrice: Int = itemPrice * song
    val discount = totalPrice - 100
    val superDiscount = totalPrice * 0.95

    if (totalPrice < 1000) {
        println(" Total prise $totalPrice")
    }; if (totalPrice in 1001..10_000 && musicLover) {
        val result = discount * 0.99
        println(" Total price $result") //скидка 100 р +1 %
    }; if (totalPrice in 1001..10_000 && !musicLover) {
        println(" Total prise $discount") //скидка 100 р
    }; if (totalPrice > 10_001 && musicLover) {
        val result = superDiscount * 0.99
        println(" Total price $result")
    }; if (totalPrice > 10_001 && !musicLover) {
        println(" Total price $superDiscount")
    }

}
