public class BubbleSort {
    public static void main(String argd []){
        int arr[]={29,4,9,43,16,23};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } 
    
}
