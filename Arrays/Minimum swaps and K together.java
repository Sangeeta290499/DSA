// Minimum swaps and K together

// optimized Approach:

// Count elements ≤ k → windowSize
// Count elements > k in first windowSize → badCount
// Set minSwaps = badCount
// Slide window:
    // If outgoing element > k → badCount--
    // If incoming element > k → badCount++
    // Update minSwaps = min(minSwaps, badCount)
// Return minSwaps
// Time: O(n)
// Space: O(1)

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
    
        int n = arr.length;
        
        int windowSize = 0;
        for(int num : arr){
            if(num <= k){
                windowSize++;
            }
        }
        
        if(windowSize <= 1) return 0;
        
        int badCount = 0;
        for(int i = 0;i < windowSize; i++){
            if(arr[i] > k){
                badCount++;
            }
        }
        
          int minSwaps = badCount;
        for(int i = windowSize; i < n;i++){
            if(arr[i-windowSize] > k){
                badCount--;
            }
            
            if(arr[i] > k){
                badCount++;
            }
            minSwaps = Math.min(minSwaps, badCount);
        }
        return minSwaps;
    }
}
