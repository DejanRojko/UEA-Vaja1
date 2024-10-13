package com.example.vaja1_nakljucnoiskanje

class Rastrigin (dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { -5.12 },
    List(dimensions) { 5.12 }
){
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }

        val sum = x.sumOf { it * it - 10 * kotlin.math.cos(2 * kotlin.math.PI * it) }
        return 10 * x.size + sum
    }
}