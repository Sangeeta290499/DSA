
//  Rearrange Array Alternately

// Approach:
// Sort the array.
// Initialize two pointers:
// l = 0 (smallest)
// r = n - 1 (largest)
// Choose a number greater than the maximum element (for encoding).
// Traverse the array:
    // At even index → place next largest element
    // At odd index → place next smallest element
    // (store both old and new value using encoding trick)
    // After traversal, divide every element by the chosen max number to get final rearranged values.
// Time Complexity:
    // Sorting → O(n log n)
    // Rearranging loop → O(n)
    // Final decoding loop → O(n)
    // Overall Time Complexity = O(n log n)
// Space complexity: O(1)

class Solution {
  
    public void rearrange(int[] arr) {
        int n = arr.length;
          Arrays.sort(arr);
        int l = 0;
        int r = n-1;
        
       int max = arr[n - 1] + 1;;
        for(int i = 0; i< n;i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + (arr[r]%max)* max ;
                r--;
            }
            else{
                arr[i] = arr[i] + (arr[l]%max)* max ;
                l++;;
            }
        }
        
        for(int i = 0; i< n;i++){
            arr[i] = arr[i]/ max;
        }
    }
}
