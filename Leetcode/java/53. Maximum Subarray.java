// class Solution {
// public static int permute(int arr[], int pos, int limit, int max) {
//         int localMax = max;

//         for (int i = pos; i < arr.length; i++) {
//             int sum = 0;

//             if (limit == arr.length + 1) {
//                 return localMax;
//             }

//             for (int j = i; j < i + limit; j++) {
//                 sum += arr[j];
//             }

//             if (localMax < sum) {
//                 localMax = sum;
//             }

//             if (i + limit >= arr.length) {
//                 int recursiveMax = permute(arr, 0, limit + 1, localMax);
//                 localMax = Math.max(localMax, recursiveMax);
//                 return localMax;
//             }
//         }

//         int recursiveMax = permute(arr, 0, limit + 1, localMax);
//         localMax = Math.max(localMax, recursiveMax);
//         return localMax;
//     }
//     public int maxSubArray(int[] nums) {
//         int max = nums[0];
//         int sol = permute(nums,0,1,max);
//         return sol;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);  
        maxSum = Math.max(maxSum, currentSum);   
    }
    return maxSum;
    }
}