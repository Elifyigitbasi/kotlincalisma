// Kullanıcının girdiği bir sayıyı ondalıklı sayıya dönüştüren bir programı nasıl yazarsınız?

fun main() {
    println("Bir sayı giriniz:")
    val girilenSayi = readLine()?.toDoubleOrNull()

    if (girilenSayi != null) {
        println("Ondalıklı sayıya dönüştürülen değer: $girilenSayi")
    } else {
        println("Geçerli bir sayı girmediniz!")
    }
}