public class DeleteElementArray {
    public static void main(String[] args) {
        int arr[]={10,9,7,16,32,21,30,27};
        int del=32;
        for(int i=0; i<arr.length; i++){
            if(del == arr[i]){
                for(int j=i; j<arr.length-1; j++){
                     arr[j]= arr[j+1];
                }
                break;
            }
        }
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
