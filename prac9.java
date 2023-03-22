import java.util.Scanner;

public class prac9 {
    public static void main(String args[]) {
        int r,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers to check palindrome or not:");
        int n=sc.nextInt();
        int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}

