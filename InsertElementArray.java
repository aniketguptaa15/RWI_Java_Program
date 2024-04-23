public class InsertElementArray {
    public static void main (String args[]){
        int pos=3; 
        int Element= 35; 
        int arr[]= {10,5,7,12,31,17,9,11};
        for(int i=arr.length-1; i>pos-1; i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1] = Element;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
