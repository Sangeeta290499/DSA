//  Sum of Subarrays

// Approach / Idea
// Brute-force (for understanding only):
// Generate all subarrays.
// Sum each subarray and add to a total.
// This is O(n²) or O(n³) depending on implementation → inefficient for large arrays.

//Optimised Approach:

// Goal: Find sum of all subarrays.
// Idea: Count how many times each element appears instead of generating all subarrays.
// For element arr[i] at index i in array of size n:
// Start positions = i + 1
// End positions = n - i
// Total subarrays including arr[i] = (i + 1) * (n - i)
// Contribution of element: arr[i] * (i + 1) * (n - i)
// Sum contributions for all elements → total sum of all subarrays.
// Time Complexity: O(n), Space Complexity: O(1)

class Solution {
    public int subarraySum(int[] arr) {
        // code here
      int n = arr.length;
        int total = 0;

        for(int i = 0; i < n; i++) {
            total += arr[i] * (i + 1) * (n - i);
        }

        return total;
    }
}
