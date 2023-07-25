//Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana yazdıran bir programı nasıl yazarsınız?

fun main() {
    println("Bir ay ismi giriniz:")
    val ay = readLine()?.toLowerCase()

    if (ay == "ocak" || ay == "şubat" || ay == "aralık") {
        println("Bu ay kış mevsimindedir.")
    } else if (ay == "mart" || ay == "nisan" || ay == "mayıs") {
        println("Bu ay ilkbahar mevsimindedir.")
    } else if (ay == "haziran" || ay == "temmuz" || ay == "ağustos") {
        println("Bu ay yaz mevsimindedir.")
    } else if (ay == "eylül" || ay == "ekim" || ay == "kasım") {
        println("Bu ay sonbahar mevsimindedir.")
    } else {
        println("Geçersiz ay ismi girdiniz!")
    }
}İ