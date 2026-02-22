class Main{
    // check all subarrays of size k
    static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;

        for (int i = 0; i <= n - k; i++) {
            int currSum = 0;

            // compute sum of current subarray
            for (int j = 0; j < k; j++) {
                currSum += arr[i + j];
            }

            // update maximum sum
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(arr, k));
    }
}
