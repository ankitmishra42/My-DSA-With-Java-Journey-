
import java.util.Scanner;

public class cIfElse {
    public static void main(String[] args) {
        System.out.print("Enter 1 or 2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        }
        else if (button == 2) {
            System.out.println("Namaste");
        }
        else if (button == 3) {
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
