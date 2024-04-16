public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }    
        int n = nums.length + 1;
        int expectedSum = n *
         (n + 1) / 2;
        return expectedSum - sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4, 5,9};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}
