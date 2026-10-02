// TranThanhBao_25810005

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val viTriCuoi = value.trim().lastIndexOf(' ')
            if (viTriCuoi == -1) {
                ho = ""
                ten = value.trim()
            } else {
                val chuoi = value.trim()
                ho = chuoi.substring(0, viTriCuoi)
                ten = chuoi.substring(viTriCuoi + 1)
            }
        }
}

fun main() {
    val kh = KhachHang("Tran Thanh", "Bao")
    println("Ho ten ban dau: ${kh.hoTen}")

    kh.ten = "An"
    println("Sau khi doi ten: ${kh.hoTen}")

    kh.hoTen = "Nguyen Van Minh"
    println("Ho: ${kh.ho}")
    println("Ten: ${kh.ten}")
}
