public class SecondLargest {
    public static void main (String args[]){
        int arr[]={10,23,12,75,98,44,32};
        
        int temp=0; 
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp= arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSecond Largest Element in array "+arr[arr.length-2]);

    }
    
}
