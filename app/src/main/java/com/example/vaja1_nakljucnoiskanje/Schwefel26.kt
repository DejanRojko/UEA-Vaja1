package com.example.vaja1_nakljucnoiskanje

class Schwefel26 (dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { -500.0 },
    List(dimensions) { 500.0 }
) {
    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }
        return x.sumOf {it * kotlin.math.sin(kotlin.math.sqrt(kotlin.math.abs(it)))}
    }
}