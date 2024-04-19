public class MaxAndMin {
    public static void main (String args[]){
        int arr[]={2,5,8,21,7,9,32,14,4};
        int max=arr[0],min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Maximum element in array is "+max); 
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Minimum element in array is "+min); 

    }
    
}
