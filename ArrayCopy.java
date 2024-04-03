public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l=arr.length;
        int[] arr1 = new int[l];
        
        // Copying elements from arr to arr1
        for (int i = 0; i < l; i++) {
            arr1[i] = arr[i];
        }

        // Printing elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
