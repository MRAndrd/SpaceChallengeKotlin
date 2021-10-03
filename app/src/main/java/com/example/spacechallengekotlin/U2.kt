package com.example.spacechallengekotlin

class U2 : Rocket(120, 18000, 29000) {
    var chanceOfLaunchExplosionU2 = 4 * (rocketCanCarry / maxWeight)
    var chanceOfLandingCrashU2 = 8 * (rocketCanCarry / maxWeight)
    override fun launch(): Boolean {
        val random = (Math.random() * 100 + 1).toInt()
        return random > chanceOfLaunchExplosionU2
    }

    override fun land(): Boolean {
        val random = (Math.random() * 100 + 1).toInt()
        return random > chanceOfLandingCrashU2
    }
}