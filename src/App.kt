class App(var creatorName : String) {

    fun run() {
        printHeader()
    }
    private fun printHeader() {
        println("==================================")
        println("Order PC di $creatorName")
        println("==================================")
    }
}

fun main() {
    val app = App("Cup Cup Store")
    app.run()
}