public class BinarySearch {
    public static void main(String args[]){
        int a[]={2,4,6,9,10,14,17,20,78};
        int item=2;
        int li=0;
        int hi = a.length-1;
        int mid= li+hi/2;
        while(li<=hi){
            if(a[mid]==item){
                System.out.println("Elemnt found at "+mid+" index position");
                break;
            }
            else if(item>a[mid]){
                li= mid+1;
            }
            else if(item<a[mid]){
                hi= mid-1;
            }
            mid= li+hi/2;
        }
        if(hi<li){
            System.out.println("Element not found in array");
        }
    }
    
}
