// Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran bir programı nasıl yazarsınız?

fun main() {
    println("Lütfen bir harf giriniz:")
    val harf = readLine()?.getOrNull(0)

    if (harf == null || !harf.isLetter()) {
        println("Geçerli bir harf girmediniz!")
    } else if (harf in listOf('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü')) {
        println("Sesli Harf")
    } else {
        println("Sessiz Harf")
    }
}