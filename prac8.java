import java.util.Scanner;

public class prac8 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        int upper=0;
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
        System.out.println("Uppercase letters:-"+upper);
    }
}
