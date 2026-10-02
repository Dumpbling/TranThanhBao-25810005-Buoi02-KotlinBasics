// TranThanhBao_25810005

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("Ban phim co", 850000.0, 25)

    val sp2 = SanPham(tenSanPham = "Chuot khong day", gia = 320000.0)

    println("San pham 1")
    println("Ten san pham: ${sp1.tenSanPham}")
    println("Gia: ${sp1.gia}")
    println("So luong ton kho: ${sp1.soLuongTonKho}")

    println("San pham 2")
    println("Ten san pham: ${sp2.tenSanPham}")
    println("Gia: ${sp2.gia}")
    println("So luong ton kho: ${sp2.soLuongTonKho}")
}
