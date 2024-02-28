package ChallengeCH1

class WarungBinar {

    data class menus(val menuNames: String, val menuPrices: Int)

    val menu = arrayOf(
        menus("Ayam Bakar\t\t\t", 50000),
        menus("Ayam Goreng\t\t\t", 40000),
        menus("Ayam Geprek\t\t\t", 40000),
        menus("Kulit Ayam Crispy\t", 15000),
        menus("Sate Usus Ayam\t\t", 5000)
    )

}

class WarungBinarDisplay {

    private val WarungBinar = WarungBinar()

    fun menuIndex() {
        WarungBinar.menu.forEachIndexed() { index, data ->
            print("${index + 1}")
            if (index < WarungBinar.menu.size - 1){
                print("/")
            }
        }
    }

    fun menuPrint() {
        WarungBinar.menu.forEachIndexed { index, data ->
            println("${index + 1}. ${data.menuNames} = Rp${data.menuPrices}/porsi")
        }
    }

}