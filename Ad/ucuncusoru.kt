fun main() {
    println("Birinci sayıyı girin:")
    val sayi1 = readLine()?.toDoubleOrNull()

    println("İkinci sayıyı girin:")
    val sayi2 = readLine()?.toDoubleOrNull()

    if (sayi1 == null || sayi2 == null) {
        println("Geçersiz giriş")
        return
    }

    println("Toplam: ${topla(sayi1, sayi2)}")
    println("Fark: ${cikar(sayi1, sayi2)}")
    println("Çarpım: ${carp(sayi1, sayi2)}")
    if (sayi2 == 0.0) {
        println("Bir sayıyı 0'a bölemezsiniz!")
    } else {
        println("Bölüm: ${bol(sayi1, sayi2)}")
    }
}

fun topla(sayi1: Double, sayi2: Double): Double {
    return sayi1 + sayi2
}

fun cikar(sayi1: Double, sayi2: Double): Double {
    return sayi1 - sayi2
}

fun carp(sayi1: Double, sayi2: Double): Double {
    return sayi1 * sayi2
}

fun bol(sayi1: Double, sayi2: Double): Double {
    if (sayi2 == 0.0) {
        throw IllegalArgumentException("Bir sayıyı 0'a bölemezsiniz!")
    }
    return sayi1 / sayi2
}