fun main() {
    print(solution(1, "..."))
}

fun solution(maxLength: Int, text: String): Int {
    if (text.filter { it.isLetterOrDigit() }.isEmpty())
        return 0
    var list = text.split(" ")
    list = list.filter { it.filter { it.isLetterOrDigit() }.length <= maxLength }
    return list.size
}