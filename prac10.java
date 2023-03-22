import java.util.Scanner;

public class prac10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        pyramidString(input);
    }

    public static void pyramidString(String str) {

        for (int i = 0 ; i  < str.length();i++){

            for(int j=str.length();j>i+1;j--){
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println("");
        }
    }
}