// TranThanhBao - 25810005

fun main() {
    val danhSachSach = mutableListOf(
        "Clean Code",
        "Kotlin in Action",
        "Head First Kotlin",
        "Effective Kotlin",
        "The Pragmatic Programmer"
    )

    println("Danh sách ban đầu:")
    inDanhSach(danhSachSach)

    danhSachSach.add("Refactoring")
    danhSachSach.add("Design Patterns")

    val daXoa = danhSachSach.remove("Head First Kotlin")
    println("\nĐã xoá \"Head First Kotlin\": $daXoa")

    danhSachSach.sort()

    println("\nDanh sách sau khi thêm, xoá và sắp xếp:")
    inDanhSach(danhSachSach)
}

private fun inDanhSach(danhSach: List<String>) {
    danhSach.forEachIndexed { chiSo, tenSach ->
        println("${chiSo + 1}. $tenSach")
    }
}
