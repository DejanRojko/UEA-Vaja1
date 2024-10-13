package com.example.vaja1_nakljucnoiskanje

import kotlin.math.pow

class Rosenbrock (dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { -5.0 },
    List(dimensions) { 10.0 }
) {
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }
        return x.sumOf {100.0*(it + 1 -it.pow(2)).pow(2) + (it - 1).pow(2)}
    }

}