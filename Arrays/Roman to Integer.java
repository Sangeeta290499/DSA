// Roman to Integer

//Approach:
// Store Roman symbols and their values in a HashMap.
// Initialize a variable res = 0 to store the final result.
// Traverse the string from left to right.
// If current value is less than the next value, subtract it (subtractive case like IV, IX).
// Otherwise, add the current value to the result.
// TC: O(n) | SC: O(1)

class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer>map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for(int i = 0;i < s.length();i++){
            if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res = res-map.get(s.charAt(i));
            }
            else{
                 res = res+map.get(s.charAt(i));
            }
        }
        return res;
    }
}
