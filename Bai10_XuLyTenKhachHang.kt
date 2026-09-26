// TranThanhBao - 25810005

fun xuLyTenKhachHang(tenKhachHang: String?) {
    val doDai: Int? = tenKhachHang?.length
    println("Độ dài tên (safe call): $doDai")

    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"
    println("Xin chào, $tenHienThi")

    val doDaiAnToan: Int = tenKhachHang?.length ?: 0
    println("Độ dài tên (safe call + Elvis): $doDaiAnToan")
}

fun minhHoaToanTuHaiChamThan(tenKhachHang: String?) {
    val doDai: Int = tenKhachHang!!.length
    println("Độ dài tên (toán tử !!): $doDai")
}

fun main() {
    println("--- Có tên khách hàng ---")
    xuLyTenKhachHang("Nguyễn Văn An")

    println("\n--- Tên khách hàng là null ---")
    xuLyTenKhachHang(null)

    println("\n--- Toán tử !! với giá trị không null ---")
    minhHoaToanTuHaiChamThan("Nguyễn Văn An")

    println("\n--- Toán tử !! với null (gây lỗi, được bắt bằng try-catch để minh hoạ) ---")
    try {
        minhHoaToanTuHaiChamThan(null)
    } catch (e: NullPointerException) {
        println("Đã xảy ra NullPointerException: !! gặp giá trị null")
    }
}
