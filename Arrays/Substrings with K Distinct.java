// Substrings with K Distinct

// BruteForce Approach:
  // Initialize ans = 0.
  // Use outer loop i = 0 → n-1
  // (Fix starting index of substring)
  // For every i, create:
  // Frequency array (size 26)
  // count = 0
  // Use inner loop j = i → n-1
  // (Expand substring from i to j)
  // For each character s.charAt(j):
  // If its frequency is 0 → increase count
  // Increase its frequency
  // If count == k → increment ans
  // If count > k → break inner loop
  // After all loops finish → return ans
  // Time Complexity: O(n²)
  // Space Complexity: O(1)


class Solution {
    public int countSubstr(String s, int k) {
       
      int ans = 0;
       for(int i = 0; i< s.length();i++){
           int[] freq = new int[26];
           int count = 0;
           for(int j = i;j < s.length();j++){
               
               char ch = s.charAt(j);
               if(freq[ch-'a'] == 0){
                   count++;
               }
               
               freq[ch-'a']++;
           if(count == k){
               ans++;
           }
           if(count > k){
               break;
           }
       }
       }
       return ans;
        
    }
}
