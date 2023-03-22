import java.util.Scanner;

public class prac4 {
    public static void main(String asrg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number:- ");
        int i,count=0;
        int a = sc.nextInt();
        
         for(i=2; i<a; i++)
        {
           if(a%i == 0)
           {
              count++;
              break;
           }
        }
        if(count==0)
           System.out.println("It is a Prime Number.");
        else
           System.out.println("It is not a Prime Number.");
    }
}
