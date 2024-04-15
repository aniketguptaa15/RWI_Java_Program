import java.util.*;
public class Reverse {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num you want to reverse ");
        int num= sc.nextInt();
        int rev=0, rem;
        for(int i=1; num>=0; i++){
           rem = num%10;
           rev= (rev*10)+rem;
           num=num/10;
        }
        System.out.println(rev);
     
    }
    
}
