package com.example.vaja1_nakljucnoiskanje

abstract class Fitness(val dimensions: Int ,val lowerBounds: List<Double>, val upperBounds: List<Double>) {

    abstract fun calculate(x: List<Double>): Double

    fun isWithinBounds(x: List<Double>): Boolean {
        return x.indices.all { lowerBounds[it] <= x[it] && x[it] <= upperBounds[it] }
    }
}