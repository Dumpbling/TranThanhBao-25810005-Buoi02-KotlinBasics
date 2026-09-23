// TranThanhBao - 25810005

fun main() {
    val canNang = 65.0
    val chieuCao = 1.70

    val bmi = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Cân nặng: $canNang kg, chiều cao: $chieuCao m")
    println("Chỉ số BMI: ${"%.1f".format(bmi)}")
    println("Phân loại: $phanLoai")
}
