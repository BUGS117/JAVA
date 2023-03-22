import java.util.Scanner;

public class prac2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter weight in pounds: ");
        double a = sc.nextDouble();
        System.out.print("Please Enter Height in Inch: ");
        double b = sc.nextDouble();

        double w = (a * 0.45359237);
        double h = (b * 0.0254);
        double x = (w/(h*h));
        System.out.println("Body Mass Index(BMI) is:");
        System.out.println(x);
    }
}
