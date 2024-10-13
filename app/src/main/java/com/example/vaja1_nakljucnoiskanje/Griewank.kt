package com.example.vaja1_nakljucnoiskanje

import kotlin.math.cos

class Griewank (dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { -600.0 },
    List(dimensions) { 600.0 }
) {
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }
        /* :TODO */

        // first term
        val sum = x.sumOf { it * it }
        val term1 = sum / 4000.0

        // second term
        val product = x.indices.fold(1.0) { acc, i -> acc * cos(x[i] / kotlin.math.sqrt((i + 1).toDouble())) }
        val term2 = product

        return term1 - term2 + 1
    }
}

