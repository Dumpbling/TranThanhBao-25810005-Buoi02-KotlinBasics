// TranThanhBao - 25810005

fun main() {
    val diemTrungBinh = 8.7

    val xepLoai = when (diemTrungBinh) {
        in 9.0..10.0 -> "Xuất sắc"
        in 8.0..<9.0 -> "Giỏi"
        in 7.0..<8.0 -> "Khá"
        in 5.0..<7.0 -> "Trung bình"
        in 0.0..<5.0 -> "Yếu"
        else -> "Điểm không hợp lệ (phải nằm trong khoảng 0 đến 10)"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại: $xepLoai")
}
