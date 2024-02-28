package ChallengeCH1

interface Message {
    fun successMessage()
    fun errorMessage()
}

class selectMenuMessages : Message {

    private val WarungBinar = WarungBinar()

    private var buyerChoice: Int = 0
    private var menuName : String = ""
    private var menuPrice : Int = 0

    fun setBuyerChoice(choice: Int) {
        buyerChoice = choice
    }

    fun setMenuDetails(name: String, price: Int) {
        menuName = name
        menuPrice = price
    }

    override fun successMessage() {
        if (buyerChoice > 0 && buyerChoice <= WarungBinar.menu.size) {
            println("=======================================================")
            println("Kamu Memilih menu ${buyerChoice}")
        }
        println("Nama Menu \t: ${menuName}")
        println("Harga \t\t: ${menuPrice}")
        println("=======================================================")
    }

    override fun errorMessage() {
        println("Pilihan Menu Tidak Tersedia!")
        println("=======================================================\n")
    }

}

class paymentMessages : Message {

    override fun successMessage() {
        println("Terima kasih, Anda berhasil memesan makanan")
        println("=======================================================")
    }

    override fun errorMessage() {
        println("Maaf, pembayaran Anda gagal!")
    }

}

class foodDeliveryMessages : Message {

    override fun successMessage() {
        takeAway()
        delivery()
    }

    override fun errorMessage() {
        println("Metode Pengiriman Tidak Valid!")
    }

    fun takeAway() {
        println("=======================================================")
        println("Makananmu sedang dimasak... .")
        Thread.sleep(5000)
        println("Makananmu sudah siap! Silahkan ambil di resto ya!")
        Thread.sleep(5000)
        println("Pesanan Selesai!")
        Thread.sleep(3000)
    }

    fun delivery() {
        println("=======================================================")
        println("Makananmu sedang dimasak... .")
        Thread.sleep(5000)
        println("Makananmu sudah siap! Driver segera menuju tempatmu!")
        Thread.sleep(5000)
        println("Driver sampai! Pesanan Selesai!")
        Thread.sleep(3000)
    }

}