// Majority Element

// BruteForce Approach:
// For each element i
// Initialize count = 0
// Compare with every element j
// If equal → increment count
// If count > n/2 → return element
// Time: O(n²)
// Space: O(1)
// Pitfall: Very slow for large n

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        for(int i = 0; i< n;i++){
              int count = 0;
             for(int j = 0; j< n;j++){
                if(nums[i] == nums[j]){
                count++;
            }
        }
            if(count > n/2){
            return nums[i];
            }
        }
        return -1;
    }
}

// Optimised Approach:

// Initialize:
// count = 0
// candidate = 0
// Traverse array
// If count == 0 → update candidate
// If number == candidate → increment count
// Else decrement count
// Return candidate
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int count = 0;
         int candidate = 0;

         for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
         }
         return candidate;
    }
}
