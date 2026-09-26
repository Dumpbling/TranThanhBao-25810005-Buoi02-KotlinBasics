//TranThanhBao_25810005
val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

fun main() {
    println(kiemTraDoDai("abc123"))
    println(kiemTraDoDai("matkhau123"))
    println(kiemTraDoDai("12345678"))
}