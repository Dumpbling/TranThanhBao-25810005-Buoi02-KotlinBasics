// TranThanhBao_25810005

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "Nguyen Van A", 15000000.0)

    val nv2 = NhanVien("Tran Thi B")

    println("Nhan vien 1: ${nv1.ten}, luong thang: ${nv1.luongThang}")
    println("Nhan vien 2: ${nv2.ten}, luong thang: ${nv2.luongThang}")
}
