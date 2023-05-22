class Solution {
    fun fizzBuzz(n: Int): List<String> {
    var arrayOfOutputs: List<String> = listOf()

    for (number in 1..n) {
        if (number %3 ==0 && number % 5 == 0) {
            arrayOfOutputs += "FizzBuzz"
        }
        else if (number % 3 == 0) {
            arrayOfOutputs += "Fizz"
        } else if (number % 5 == 0) {
            arrayOfOutputs += "Buzz"
        }else{
            arrayOfOutputs += "$number"
        }
    }
    return arrayOfOutputs;
    }
}