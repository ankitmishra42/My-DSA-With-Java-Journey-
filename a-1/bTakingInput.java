
import java.util.Scanner;

public class bTakingInput {
    public static void main(String[] args) {
        System.out.print("Enter Any String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your Entered String: "+name);
    }
}
