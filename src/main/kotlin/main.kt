const val like = 1011
fun main() {

    if (like %100 == 11) println("Понравилось $like людям") else humans()

}

fun humans() {
    if (like % 10 == 1 || like == 1) println("Понравилось $like человеку")
    else println("Понравилось $like людям")
}