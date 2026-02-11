Missing in Arrays:

// The array contains numbers from 1 to n, but one number is missing.
// Find n using: n = arr.length + 1.
// Add all numbers from 1 to n by looping and store the total.
// Add all elements of the array and subtract this sum from the total — the result is the missing number.

class Solution {
    int missingNum(int arr[]) {
       
       int totalEle = 0;
       int SumIndex = 0;
       
       for(int i = 0; i< arr.length;i++){
           totalEle += arr[i];
       }
       
       for(int i = 1;i<=arr.length+1;i++){
          SumIndex += i;
       }
       
       int res = SumIndex - totalEle;
          return res;
        }
    }
