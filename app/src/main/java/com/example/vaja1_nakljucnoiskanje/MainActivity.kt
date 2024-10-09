package com.example.vaja1_nakljucnoiskanje

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vaja1_nakljucnoiskanje.Sphere
import com.example.vaja1_nakljucnoiskanje.Fitness


fun main (){
        //SPHERE
/*        val sphere = Sphere(2)
        val x = listOf(0.0, 0.0)
        println(sphere.calculate(x))*/
        //ACKLEY
        val ackley = Ackley(2)
        val x1 = listOf(0.0, 0.0)
        println(ackley.calculate(x1))

}