import java.util.ArrayList;

class Main {

    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int current_sum = arr[left] + arr[right];
            // If current sum = target, return left and right
            if (current_sum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1); // 1-based indexing
                result.add(right + 1);
                return result;
            }
            // If current sum < target, then increase the
            // current sum by moving the left pointer by 1
            else if (current_sum < target) {
                left++;
            }
            else {
                // If current sum > target, then decrease the
                // current sum by moving the right pointer by 1
                right--;
            }
        }

        // no pair sum with given target
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        ArrayList<Integer> result = twoSum(arr, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
