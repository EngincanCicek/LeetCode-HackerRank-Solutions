class Solution {
    fun reverse(n: Int): Int {
    var isNegative: Boolean = false
    var text: String = n.toString();
    if (text.contains("-")) {
        text = text.replace("-", "")
        isNegative = true
    }

    try {
        var reversedInt: Int = text.reversed().toInt()

        if (isNegative) return (reversedInt * -1)
        else return reversedInt

    } catch (e: Exception) {
        return 0


    }
    }
}