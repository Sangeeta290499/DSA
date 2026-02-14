// Maximum Nesting Depth of the Parentheses

// Initialize two variables: currentDepth to track ongoing nesting level and maxDepth to store the maximum depth found.
// Traverse the string character by character using a loop.
// If the character is '(', increment currentDepth because we are entering a new level of nesting.
// Update maxDepth using Math.max(maxDepth, currentDepth) to keep track of the highest nesting level.
// If the character is ')', decrement currentDepth because we are exiting one level of nesting.

class Solution {
    public int maxDepth(String s) {
        
        int currentDepth = 0;
        int maxDepth = 0;

        for(int i = 0; i<s.length();i++){
           char ch = s.charAt(i);

            if(ch == '('){
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            else if(ch == ')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
