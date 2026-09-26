//TranThanhBao_25810005
fun xuLyVanBan(vanBan: String, xuLy: (String) -> String): String {
    return xuLy(vanBan)
}

fun daoNguoc(vanBan: String): String = vanBan.reversed()

fun main() {
    println(xuLyVanBan("Xin chao", { it.uppercase() }))
    println(xuLyVanBan("Xin chao", ::daoNguoc))
    println(xuLyVanBan("Xin chao") { it.lowercase() })
}