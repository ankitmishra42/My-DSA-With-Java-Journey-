import java.util.Scanner;

public class eFunction {
    public static void printMyName(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
    
}