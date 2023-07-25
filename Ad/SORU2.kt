//Bir sayının faktöriyelini hesaplayan bir fonksiyonu nasıl oluşturursunuz?
fun factorial(n: Int): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    println("Faktöriyelini hesaplamak istediğiniz sayıyı girin:")
    val sayi = readLine()?.toIntOrNull()

    if (sayi != null && sayi >= 0) {
        val result = factorial(sayi)
        println("$sayi! = $sayi")
    } else {
        println("Geçerli bir pozitif tamsayı giriniz.")
    }
}
