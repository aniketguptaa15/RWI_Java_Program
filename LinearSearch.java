import java.util.*;
public class LinearSearch {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int arr[]= {10,3,82,14,34,4,6};
        System.out.print("Enter Element for search ");
        int item= sc.nextInt();
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item){
                System.out.println("Element Found at "+i+" index");
                temp =1;
            }
            
        }
        if(temp==0){
            System.out.println("Element not found in Array");
        }
        
    }
    
}
