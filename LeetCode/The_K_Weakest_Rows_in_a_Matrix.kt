class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        var arrayOfOutputIndex = IntArray(k)
        var arrayOfSolidersWithTheirRealIndexes = mutableListOf<Int>()

        for (i in 0 until mat.size){ // first dimension
            var counterOfSoliders = 0
            for (j in 0 until  mat[i].size){ // second dimension
                if (mat[i][j] == 1) counterOfSoliders++

            }
            arrayOfSolidersWithTheirRealIndexes.add(counterOfSoliders)

        }
        var arrayOfSolidersWeakestToStrongest = arrayOfSolidersWithTheirRealIndexes.sorted().toMutableList()

        for (i in 0 until k){ 
            arrayOfOutputIndex[i] = arrayOfSolidersWithTheirRealIndexes.indexOf(arrayOfSolidersWeakestToStrongest[i])
            arrayOfSolidersWithTheirRealIndexes[arrayOfSolidersWithTheirRealIndexes.indexOf(arrayOfSolidersWeakestToStrongest[i])] = -1

            // I have all information just need to output

        }

        return  arrayOfOutputIndex

    }
}
