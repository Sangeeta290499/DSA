 // Valid Anagram

// Bruteforce Approach:

// If lengths of both strings are different, return false.
// Convert both strings into character arrays.
// Sort both character arrays.
// Compare characters at each index after sorting.
// If all characters match, return true; otherwise return false.

// TC: O(n log n) | SC: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0;i < ch1.length;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }

        return true;
    }
}
