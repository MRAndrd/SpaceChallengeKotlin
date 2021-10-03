package com.example.spacechallengekotlin

import java.io.File
import java.io.FileNotFoundException
import java.util.*

class Simulation(mainActivity: MainActivity?) {
    // щоб поділити строку на частини
    private lateinit var oneLine: Array<String>
    @Throws(FileNotFoundException::class)
    fun loadItems(): ArrayList<Item> {
        val goods = ArrayList<Item>()
        val file = File("Phase-1.txt")
        val fileScanner = Scanner(file)
        while (fileScanner.hasNextLine()) {
            oneLine = fileScanner.nextLine().split("=").toTypedArray()
            val item = Item(oneLine[0], oneLine[1].toInt())
            goods.add(item)
        }
        return goods
    }

    fun loadU1(goods: ArrayList<Item>, loadItems: ArrayList<Item?>?): ArrayList<Rocket> {
        val listOfU1RocketsU1 = ArrayList<Rocket>()
        var U1rocket = U1()
        for (item in goods) {
            if (!U1rocket.canCarry(item!!)) {
                listOfU1RocketsU1.add(U1rocket)
                U1rocket = U1()
            }
            U1rocket.carry(item)
        }
        listOfU1RocketsU1.add(U1rocket)
        return listOfU1RocketsU1
    }

    fun loadU2(goods: ArrayList<Item>, loadItems: ArrayList<Item?>?): ArrayList<Rocket> {
        val listOfU1RocketsU2 = ArrayList<Rocket>()
        var U2rocket = U2()
        for (item in goods) {
            if (!U2rocket.canCarry(item!!)) {
                listOfU1RocketsU2.add(U2rocket)
                U2rocket = U2()
            }
            U2rocket.carry(item)
        }
        listOfU1RocketsU2.add(U2rocket)
        return listOfU1RocketsU2
    }

    fun runSimulation(
        listOfU1RocketsU1: ArrayList<Rocket>,
        listOfU1RocketsU2: ArrayList<Rocket?>?,
        rocket: Rocket = Rocket()
    ): Int {
        var totalBudget = 0
        val rocket1: Rocket = U1()
        run {
            if (!rocket1.land() || !rocket1.launch()) {
                totalBudget += rocket.getCost()
            }
            return totalBudget
        }
    }
}