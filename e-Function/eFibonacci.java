import java.util.Scanner;

public class eFibonacci {
    public static void Fibonacci (int n) {
        int k=1, i=0, j=1;
        while (k<=n) {
            System.out.print(i+",");
            i = i+j;
            System.out.print(j+",");
            j = i+j;
            k = j;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Frist Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fibonacci(a);
    }
    
}