import java.util.Scanner;

public class prac3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in Meters: ");
        double m = sc.nextDouble();
        double f = (m*3.28084);
        System.out.print("Entered Length in feet is: ");
        System.out.print(f);
    }
}
