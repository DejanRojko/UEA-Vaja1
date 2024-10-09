package com.example.vaja1_nakljucnoiskanje

class Sphere(dimensions: Int) : Fitness(
    dimensions,
    List(dimensions) { if (it % 2 == 0) -100.0 else -10.0 },
    List(dimensions) { if (it % 2 == 0) 100.0 else 10.0 }
) {

    override fun calculate(x: List<Double>): Double {
        if (!isWithinBounds(x)) {
            throw IllegalArgumentException("Input is out of bounds!")
        }
        return x.sumOf { it * it }
    }
}