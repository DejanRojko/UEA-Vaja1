package com.example.vaja1_nakljucnoiskanje

import kotlin.math.cos
import kotlin.math.exp
import kotlin.math.sqrt

class Ackley (dimensions: Int) : Fitness(dimensions, listOf(-32.768), listOf(32.768)){
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }
        val a = 20.0
        val b = 0.2
        val c = 2 * Math.PI

        val sum1 = x.sumOf { xi -> xi * xi }
        val sum2 = x.sumOf { xi -> cos(c * xi) }

        return -a * exp(-b * sqrt(1.0 / dimensions * sum1)) - exp(1.0 / dimensions * sum2) + a + exp(
            1.0
        )
    }
}