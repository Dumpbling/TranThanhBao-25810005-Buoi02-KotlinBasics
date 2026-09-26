//TranThanhBao_25810005
fun dinhDangDiaChi(
    hoTen: String,
    soDienThoai: String,
    soNha: String = "Chua co",
    phuong: String = "Chua co",
    thanhPho: String = "TP.HCM"
): String {
    return "$hoTen - $soDienThoai - $soNha - $phuong - $thanhPho"
}

fun main() {
    println(dinhDangDiaChi(
        hoTen = "Tran Thanh Bao",
        soDienThoai = "099999999",
        soNha = "123 Vo Van Ngan",
        phuong = "Linh Chieu",
        thanhPho = "TP.HCM"
    ))
}