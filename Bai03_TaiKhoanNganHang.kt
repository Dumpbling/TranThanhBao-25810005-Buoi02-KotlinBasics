// TranThanhBao - 25810005

fun main() {
    val soDuBanDau: Long = 5_000_000L

    var soDuHienTai: Long = soDuBanDau

    println("Số dư ban đầu: ${dinhDangTien(soDuBanDau)} VND")

    val tienGui: Long = 2_000_000L
    soDuHienTai += tienGui
    println("Gửi ${dinhDangTien(tienGui)} VND -> số dư: ${dinhDangTien(soDuHienTai)} VND")

    val tienRut: Long = 1_500_000L
    if (soDuHienTai >= tienRut) {
        soDuHienTai -= tienRut
        println("Rút ${dinhDangTien(tienRut)} VND -> số dư: ${dinhDangTien(soDuHienTai)} VND")
    } else {
        println("Số dư không đủ để rút ${dinhDangTien(tienRut)} VND")
    }

    println("Đối chiếu số dư ban đầu: ${dinhDangTien(soDuBanDau)} VND")
}

private fun dinhDangTien(soTien: Long): String = "%,d".format(soTien)
