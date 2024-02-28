package task_1_fruitSeller

class app {

    data class fruit(val name: String, val price: Int)

    val fruits = arrayOf(
        fruit("Melon", 20000),
        fruit("Apple", 6000),
        fruit("Mango", 10000),
        fruit("Avocado", 8000),
        fruit("Watermelon", 21000)
    )

    var total : Int = 0

    fun header() {

        println("========================================")
        println("        Welcome to Fruit Store !        ")
        println("========================================")
        println("Our Fruits Today :")
        fruits.forEachIndexed { index, data ->
            println("${index + 1}. ${data.name}")
        }
        println("========================================")
        print("What do you want to buy ? ")
        fruits.forEachIndexed { index, data ->
            print("${index + 1}")
            if (index < fruits.size - 1){
                print("/")
            }
        }
        print(" : ")

    }

    fun buy() {

        header()

        try {

            try {

                val buyerPick = readln().toInt()

                println("You select ${fruits[buyerPick - 1].name}")

                println("========================================")

                print("How many ${fruits[buyerPick - 1].name} you wanna buy? ")
                val qty = readln().toInt()

                total = qty * fruits[buyerPick - 1].price

                println("Total price : ${total}")

                if (total >= 100000 && total < 150000) {
                    println("You got extra 1 ${fruits[4].name}")
                } else if (total >= 150000 && total < 200000) {
                    println("You got extra 2 ${fruits[0].name}")
                } else if (total >= 200000 && total < 250000) {
                    println("You got extra 6 ${fruits[3].name}")
                } else if (total >= 250000) {
                    println("You got extra 1Kg ${fruits[1].name}")
                }

                println("========================================")
                println("\nThank You and have a nice day :)")

            } catch (err : ArrayIndexOutOfBoundsException) {
                println("You input wrong value!")
                println("========================================\n")
                buy()
            }

        } catch (err : NumberFormatException) {
            println("You input wrong value!")
            println("========================================\n")
            buy()
        }

    }

}

fun main() {
    app().buy()
}