package com.example.spacechallengekotlin

interface SpaceShip {
    abstract var rocketCanCarry: Any

    fun launch(): Boolean
    fun land(): Boolean
    fun canCarry(item: Item): Boolean
    fun carry(item: Item): Int
}