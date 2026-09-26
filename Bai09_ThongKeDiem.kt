// TranThanhBao - 25810005

fun main() {
    val mangDiem = arrayOf(8.5, 6.0, 9.0, 7.5, 5.5, 8.0, 4.5, 9.5, 7.0, 6.5)

    var tongDiem = 0.0
    var diemCaoNhat = mangDiem[0]
    var diemThapNhat = mangDiem[0]

    for (diem in mangDiem) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / mangDiem.size

    println("Điểm trung bình cả lớp: ${"%.2f".format(diemTrungBinh)}")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
