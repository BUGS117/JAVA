import java.util.Scanner;

public class prac5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.print("Enter last number:");
        int c = sc.nextInt();
        System.out.print("Maximum number is: ");
        if(a>b)
        {
            if(a>c)
            {
            System.out.print(a); 
            }
            else
            {
            System.out.println(b); 
            }
        }
        else{
            if(b>c)
            {
            System.out.println(b);
            }
            else
            {
            System.out.println(c);
            }
        }
     }
}