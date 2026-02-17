// Majority Element II

// optimised Approach:

// At most 2 elements can appear more than ⌊ n/3 ⌋ times
// Take:
// candidate1, candidate2
// count1, count2

// First Pass:
// If num == candidate1 → count1++
// Else if num == candidate2 → count2++
// Else if count1 == 0 → candidate1 = num
// Else if count2 == 0 → candidate2 = num
// Else → count1-- and count2--

// Second Pass:
// Reset count1 and count2 to 0
// Count frequency of candidate1 and candidate2
// Add to result if frequency > n/3
// Time: O(n)
// Space: O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }
             else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        if(count1 > n/3) result.add(candidate1);
         if(count2 > n/3) result.add(candidate2);

         return result;
        
    }
}
