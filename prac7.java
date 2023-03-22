import java.util.Scanner;

public class prac7 {
    public static void main(String[] args) {
       int i,count=0;
       String str;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter string:");
       str = input.nextLine();
       int length=str.length();
       System.out.println("Length="+length);
       int half=(length/2);
       for(i=half;i<length;i++)
       {
        System.out.print(str.charAt(i)+" ");
       }
    }
}
