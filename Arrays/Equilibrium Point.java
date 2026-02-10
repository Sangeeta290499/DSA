// Equilibrium Point:

// Given an array of integers, find an index such that the sum of elements before it is equal to the sum of elements after it.
// If no such index exists, return -1.

// Approach:
// 1.Calculate the total sum of the array.
// 2.Initialize leftSum = 0.
// 3.Traverse the array index by index.
// 4.For each index i:
// 5. Calculate rightSum = totalSum - leftSum - arr[i].
// 6.If leftSum == rightSum, return i.
// 7.Update leftSum += arr[i].
// 8.If no equilibrium index is found, return -1.



class Solution {
    public static int findEquilibrium(int arr[]) {
        
          int n = arr.length;
            int totalSum = 0;
         for (int i = 0; i < n; i++) {
             totalSum += arr[i];
         }
         
         int leftSum = 0;

         for (int i = 0; i < arr.length; i++) {
                int rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        return -1;
    }
}
 
