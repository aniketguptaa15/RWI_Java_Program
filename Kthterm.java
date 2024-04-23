public class Kthterm {
    public static void main (String args[]){
        int arr[]={10,23,12,75,98,44,32};
        int k=4;
        int temp=0; 
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp= arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
            if(i==k-1){
                System.out.println("Kth elememt in array is "+ arr[i]);
                break;

            }
        }

    }
}
