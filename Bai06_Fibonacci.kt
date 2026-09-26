// TranThanhBao - 25810005

fun main() {
    val giaTriToiDa = 100
    var soHienTai = 0
    var soKeTiep = 1

    for (viTri in 0 until giaTriToiDa) {
        if (soHienTai >= giaTriToiDa) break

        println("Vị trí $viTri: $soHienTai")

        val tong = soHienTai + soKeTiep
        soHienTai = soKeTiep
        soKeTiep = tong
    }
}
