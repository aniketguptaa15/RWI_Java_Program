import java.util.Scanner;
public class Sum {
    public static void main( String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number");
        int n= sc.nextInt();
        int sum =0;
        
        if(n<=1){
            System.out.println("Enter Any Positive num");
        }
        else
        {
            for(int i=1; i<=n; i++){
                sum += i;

            }
            System.out.println("Sum is : "+sum);
        }

    }
    
}
