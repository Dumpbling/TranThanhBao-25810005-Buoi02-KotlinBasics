//TranThanhBao_25810005
fun binhPhuongDayDu(x: Int): Int {
    return x * x
}
fun binhPhuongRutGon(x: Int): Int = x * x

fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println(binhPhuongDayDu(5))
    println(binhPhuongRutGon(5))
    println(chuViHinhVuongDayDu(4.0))
    println(chuViHinhVuongRutGon(4.0))
    println(laSoChanDayDu(7))
    println(laSoChanRutGon(7))
}