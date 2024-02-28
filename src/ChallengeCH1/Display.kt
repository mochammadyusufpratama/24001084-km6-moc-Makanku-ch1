package ChallengeCH1

class Display {

    var buyerChoice : Int = 0

    private val WarungBinar = WarungBinar()
    private val WarungBinarDisplay = WarungBinarDisplay()

    private fun menuDisplay() {

        println("""
            =======================================================
                 W e l c o m e   t o   W a r u n g   B i n a r
            =======================================================
            List Menu Makanan
            =======================================================
        """.trimIndent())

        WarungBinarDisplay.menuPrint()

        println("=======================================================")
        print("Pilih Menu Makanan (")

        WarungBinarDisplay.menuIndex()

        print(") : ")

    }

    private fun selectMenu(): Int {

        val selectMenuMessages = selectMenuMessages()

        menuDisplay()

        try {

            try {

                buyerChoice = readln().toInt()

                selectMenuMessages.setBuyerChoice(buyerChoice)
                selectMenuMessages.setMenuDetails(
                    WarungBinar.menu[buyerChoice - 1].menuNames,
                    WarungBinar.menu[buyerChoice - 1].menuPrices
                )
                selectMenuMessages.successMessage()

            } catch (err : ArrayIndexOutOfBoundsException) {
                selectMenuMessages.errorMessage()
                selectMenu()
            }

        } catch (err : NumberFormatException) {
            selectMenuMessages.errorMessage()
            selectMenu()
        }

        return buyerChoice

    }

    private fun payment() {

        val paymentMessages = paymentMessages()

        print("Masukkan Pembayaran : ")

        val cash = Validator.inputInteger()

        cash?.let {

            if (cash >= WarungBinar.menu[buyerChoice - 1].menuPrices) {

                if (cash > WarungBinar.menu[buyerChoice - 1].menuPrices) {
                    println("Kembalian Anda : Rp${cash - WarungBinar.menu[buyerChoice - 1].menuPrices}")
                }

                paymentMessages.successMessage()

            } else {
                paymentMessages.errorMessage()
                payment()
            }

        } ?: run {
            paymentMessages.errorMessage()
            payment()
        }

    }

    fun foodDeliveryMethods() {

        val foodDeliveryMessages = foodDeliveryMessages()

        println("1. Take Away\n2. Delivery")
        print("Metode Pengiriman Makanan (1/2) : ")

        try {

            buyerChoice = readln().toInt()

            if (buyerChoice == 1) {
                foodDeliveryMessages.takeAway()
            } else if(buyerChoice == 2) {
                foodDeliveryMessages.delivery()
            } else {
                foodDeliveryMessages.errorMessage()
                foodDeliveryMethods()
            }

        } catch (err : NumberFormatException) {
            foodDeliveryMessages.errorMessage()
            foodDeliveryMethods()
        }

    }

    fun run() {
        selectMenu()
        payment()
        foodDeliveryMethods()
    }

}