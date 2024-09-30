
import java.util.Scanner;

public class cSwitch {
    public static void main(String[] args) {
        System.out.print("Enter 1 or 2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
        
            default: System.out.println("Invalid input");
                break;
            
        }
    }
}