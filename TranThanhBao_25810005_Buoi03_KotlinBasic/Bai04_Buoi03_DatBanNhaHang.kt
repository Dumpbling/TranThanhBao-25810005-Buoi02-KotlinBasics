//TranThanhBao_25810005
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Ban thuong") {
    println("$tenKhachHang - $soLuongKhach khach - $loaiBan")
}

fun main() {
    datBan("Trần Thanh Bảo", 2)
    datBan("Nguyễn Thanh An", 1, "Ban VIP")
    datBan(tenKhachHang = "Le Van C", soLuongKhach = 6, loaiBan = "Ban ngoai troi")
}