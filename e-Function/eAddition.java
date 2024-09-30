import java.util.Scanner;

public class eAddition {
    public static int sum(int a, int b) {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.print("Enter Frist Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println("Sum Of "+a+" And "+b+" = "+c);
    }
    
}