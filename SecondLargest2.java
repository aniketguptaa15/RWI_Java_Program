public class SecondLargest2 {
    public static void main(String args[]){
        int arr[]={5,5,8,8,9,9,9,10,1000000};
        int Largest= Integer.MIN_VALUE;
        int Second_Largset= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>Largest){
                Second_Largset = Largest;
                Largest =arr[i];
            }
            else if( arr[i]>Second_Largset && arr[i]!=Largest){
                Second_Largset= arr[i];
            }
        }
        System.out.println("Second Largest Element in array is "+Second_Largset);
    }
    
}
