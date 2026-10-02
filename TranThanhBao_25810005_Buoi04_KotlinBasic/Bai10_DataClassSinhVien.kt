// TranThanhBao_25810005

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sv1 = SinhVien("25810005", "Tran Thanh Bao", 8.5)
    val sv2 = SinhVien("25810005", "Tran Thanh Bao", 8.5)

    println("sv1: $sv1")

    println("sv1 == sv2: ${sv1 == sv2}")

    val sv3 = sv1.copy(diemTrungBinh = 9.0)
    println("sv3 (copy): $sv3")
}
