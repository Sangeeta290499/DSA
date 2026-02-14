 // Isomorphic Strings

// Approach:
// If lengths of both strings are different, return false.
// Use two HashMaps to maintain character mapping (s → t and t → s).
// Traverse both strings together character by character.
// If mapping exists, check whether it matches; if not, return false.
// If no mapping exists, ensure target character is not already mapped, then store the mapping.
// TC: O(n) | SC: O(1)

import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)) {

                if (map1.get(ch1) != ch2) {
                    return false;
                }

            } else {

                if (map2.containsKey(ch2)) {
                    return false;
                }

                map1.put(ch1, ch2);
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
}
