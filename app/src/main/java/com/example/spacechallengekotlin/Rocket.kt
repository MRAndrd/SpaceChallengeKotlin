package com.example.spacechallengekotlin

open class Rocket (var rocketCost : Int, var rocketWeight : Int, var maxWeight : Int) : SpaceShip {
    constructor() : this(0,0,0)

    override var rocketCanCarry: Any = maxWeight - rocketWeight
    override fun launch(): Boolean = true

    override fun land(): Boolean = true

    override fun canCarry(item: Item): Boolean {
        return maxWeight >= rocketWeight + item.weight
    }

    override fun carry(item: Item): Int {
        rocketWeight += item.weight
        return rocketWeight
    }
    fun getCost(): Int {
        return rocketCost
    }
}