class Solution {
    fun numberOfSteps(num: Int): Int {
        var selectedNumber = num
        var counter: Int = 0

        if (num == 0) return 0

        while (true) {
            counter++

            if (selectedNumber <= 1) {
                return counter
            }
            // eğer ikiye bölünüyorsa yarısını al
            if (selectedNumber % 2 ==0) selectedNumber = selectedNumber / 2

            else selectedNumber = selectedNumber - 1
            // eğer ikiye bölünmüyorsa 1 çıkart

        }
    }
}