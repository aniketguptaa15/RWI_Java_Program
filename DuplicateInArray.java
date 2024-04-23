public class DuplicateInArray {
    public static void main (String args []){
        int arr[]= {10,2,6,4,4,3,2,10};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.println("The Duplicate Value is "+arr[i]);
                }
            }
        }
    }
    
}
