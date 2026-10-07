// TranThanhBao - 25810005

fun main() {
    val soLuong: Int = 5
    val donGia: Double = 25_000.0
    val thueVat: Double = 0.08

    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * thueVat
    val tongTien: Double = tienHang + tienThue

    println("Số lượng: $soLuong")
    println("Đơn giá: ${"%,.0f".format(donGia)} VND")
    println("Tiền hàng: ${"%,.0f".format(tienHang)} VND")
    println("Thuế 8%: ${"%,.0f".format(tienThue)} VND")
    println("Tổng tiền phải trả: ${"%,.0f".format(tongTien)} VND")
}
