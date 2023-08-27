public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        
        char[] sortedRansomNoteChars = ransomNote.ToCharArray();
        char[] sortedMagazineChars = magazine.ToCharArray();
        
        Array.Sort(sortedRansomNoteChars);
        Array.Sort(sortedMagazineChars);
        
        int ransomIndex = 0, magazineIndex = 0;
        
        while(ransomIndex < sortedRansomNoteChars.Length && magazineIndex < sortedMagazineChars.Length) {
            if(sortedRansomNoteChars[ransomIndex] == sortedMagazineChars[magazineIndex]) {
                ransomIndex++;

            }
            magazineIndex++;

        }
        
        return ransomIndex == sortedRansomNoteChars.Length;
    }
}
