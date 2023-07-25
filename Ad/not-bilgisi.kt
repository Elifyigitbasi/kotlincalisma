fun main() {
    println("Sınav notunuzu giriniz:")
    val not = readLine()?.toIntOrNull()

    if (not != null) {
        if (not >= 70) {
            println("Geçtiniz")
        } else {
            println("Kaldınız")
        }
    } else {
        println("Geçerli bir not girmediniz")
    }
}