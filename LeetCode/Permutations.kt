class Solution {

    fun permute(nums: IntArray): List<List<Int>> {

    val resulterList = mutableListOf<List<Int>>() 
    resulterList.add(emptyList()) 

    for (it in nums) {// iterativation started
        val newPermutations = mutableListOf<List<Int>>() 
        for (perm in resulterList) {
            for (i in 0..perm.size) {
                val perm1 = perm.toMutableList()
                perm1.add(i, it)
                newPermutations.add(perm1)

            }

        }

        resulterList.clear()
        resulterList.addAll(newPermutations)

    }

    return resulterList

}

}