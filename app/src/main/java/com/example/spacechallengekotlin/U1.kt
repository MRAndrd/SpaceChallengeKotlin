package com.example.spacechallengekotlin

class U1 : Rocket(100, 10000, 18000) {
    var chanceOfLaunchExplosionU1 = 5 * (rocketCanCarry / maxWeight)
    var chanceOfLandingCrashU1 = 1 * (rocketCanCarry / maxWeight)
    override fun launch(): Boolean {
        val random = (Math.random() * 100 + 1).toInt()
        return random > chanceOfLaunchExplosionU1
    }

    override fun land(): Boolean {
        val random = (Math.random() * 100 + 1).toInt()
        return random > chanceOfLandingCrashU1
    }
}

operator fun Any.div(maxWeight: Int) {
    
}
    
