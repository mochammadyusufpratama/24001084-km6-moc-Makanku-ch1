package ChallengeCH1

object Validator {

    fun inputInteger(): Int? {
        return try {
            readln().toInt()
        } catch (err : NumberFormatException) {
            null
        }
    }

}