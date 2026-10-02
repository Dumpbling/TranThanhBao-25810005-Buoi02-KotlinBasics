// TranThanhBao_25810005

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("0123456789", 5000000.0)

    val tk2 = TaiKhoanNganHang("9876543210", -100000.0)
}
