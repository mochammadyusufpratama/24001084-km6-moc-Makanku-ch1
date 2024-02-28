import model.computerSpec

class scopeFunExample {

    private val creatorName : String? = null
    private val computerData : computerSpec? = null

    fun run() {
        creatorName?.let {
            println("Created by: $creatorName")
        } ?: run {
            println("This Program is Open Source")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}