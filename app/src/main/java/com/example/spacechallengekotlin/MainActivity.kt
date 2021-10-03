package com.example.spacechallengekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var u1TextView: TextView? = null
    var u2TextView: TextView? = null
    var mainSimulation = Simulation(this)
    var totalBudgetU1 = 0
    var totalBudgetU2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        u1TextView = findViewById<View>(R.id.u1TextView) as TextView
        u2TextView = findViewById<View>(R.id.u2TextView) as TextView
    }

    @Throws(Exception::class)
    fun runTheSimulation(view: View?) {
        totalBudgetU1 = mainSimulation.runSimulation(mainSimulation.loadU1(mainSimulation.loadItems()))
        totalBudgetU2 = mainSimulation.runSimulation(mainSimulation.loadU2(mainSimulation.loadItems()))
        u1TextView!!.text = totalBudgetU1.toString() + "millions"
        u2TextView!!.text = totalBudgetU2.toString() + "millions"
    }
}