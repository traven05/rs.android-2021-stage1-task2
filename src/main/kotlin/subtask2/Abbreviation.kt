package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var res = ""
        for (letter in a.toUpperCase()) {
            for (char in b) {
                if (letter == char) res += letter
            }
        }
        return if (res == b) "YES" else "NO"
    }
}
