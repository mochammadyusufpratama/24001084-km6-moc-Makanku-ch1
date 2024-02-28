class OOPExample {


}

interface Balloon {
    fun blow()
    fun pop()
}

abstract class HotAirBalloon() : Balloon {
    override fun blow() {
        println("Blow the Balloon using hot air")
    }

    override fun pop() {
        println("Danger!!!")
    }

    abstract fun carryPassangers()
}

class RedHotAirBalloon() : HotAirBalloon() {
    override fun carryPassangers() {
        println("Carrying 5 Passangers")
    }
}

class RedBalloon : Balloon {
    override fun blow() {
        println("Meniup Balloon Merah... .")
    }

    override fun pop() {
        println("Balloon Merah Meledak... .")
    }
}

class BlueBalloon : Balloon {
    override fun blow() {
        println("Meniup Balloon Biru... .")
    }

    override fun pop() {
        println("Balloon Biru Meledak... .")
    }
}