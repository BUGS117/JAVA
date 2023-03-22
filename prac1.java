import java.util.Scanner;

public class prac1 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Values for First Equestion:- ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double e = sc.nextDouble();
        System.out.println("Values for Second Equestion:- ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double f = sc.nextDouble();

        if(((a*d)-(b*c))==0)
        {
            System.out.println("The equation has no solution");
        }else{
            double x = ((e*d) - (b*f)) / ((a*d)-(b*c));
            Double y = ((a*f)-(e*c)) / ((a*d)-(b*c));
            System.out.print("value of x:");
            System.out.println(x);
            System.out.print("value of y:");
            System.out.println(y);
        }
    }
}
