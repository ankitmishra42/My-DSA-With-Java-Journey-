
import java.util.Scanner;

public class bAddition {
    public static void main(String[] args) {
        System.out.print("Enter Any Integer: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Any Integer: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Sun of "+a+" And "+b+" = "+c);
    }
}
