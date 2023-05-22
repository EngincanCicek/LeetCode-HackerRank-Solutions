class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
    var maxWealth = 0
    
    for (cust in accounts) {
        var wealth = cust.sum()
        maxWealth = maxOf(maxWealth, wealth)
        println(wealth)
    }
    
    return maxWealth   
    }
}