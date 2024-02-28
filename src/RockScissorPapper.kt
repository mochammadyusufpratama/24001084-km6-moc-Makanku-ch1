class RockScissorPapper {
    private var playerOne : Int = -1
    private var playerTwo : Int = -1

    private fun printOptions() {
        println("""
            1. Gunting
            2. Batu
            3. Kertas
        """.trimIndent())
    }

    private fun showResult(playerOne: Int, playerTwo: Int): String {
        println("Test")
        return if(((playerOne + 1) % 3) == playerTwo) {
            "Player Two Win"
        } else if(playerOne == playerTwo) {
            "Draw"
        } else {
            "Player One Win"
        }
    }
    private fun inputPlayerOne() {
        print("Masukkan Pilihan 1 : ")
        playerOne = readln().toInt()
    }
    private fun inputPlayerTwo() {
        print("Masukkan Pilihan 2 : ")
        playerTwo = readln().toInt()
    }
    fun run() {
        printOptions()
        inputPlayerOne()
        inputPlayerTwo()
        println(showResult(playerOne, playerTwo))
    }
}

fun main() {
    RockScissorPapper().run()
}