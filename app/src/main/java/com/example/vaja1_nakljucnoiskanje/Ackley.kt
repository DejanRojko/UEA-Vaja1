package com.example.vaja1_nakljucnoiskanje


class Ackley(dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { -32.768 },  // Ackley specific bounds
    List(dimensions) { 32.768 }
) {
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }

        // Ackley constants
        val a = 20.0
        val b = 0.2
        val c = 2 * Math.PI

        // First term
        val sum1 = x.sumOf { it * it }
        val term1 = -a * kotlin.math.exp(-b * kotlin.math.sqrt((1.0 / dimensions) * sum1))

        // Second term
        val sum2 = x.sumOf { kotlin.math.cos(c * it) }
        val term2 = -kotlin.math.exp((1.0 / dimensions) * sum2)

        // Final result
        return term1 + term2 + a + kotlin.math.exp(1.0)
    }
}
