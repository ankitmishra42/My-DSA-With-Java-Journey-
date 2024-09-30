

import java.util.Scanner;

public class dLooping {
    public static void main(String[] args) {
        System.out.print("Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button<=100) {
            while (button <= 100) {
                System.out.println(button);
                button++;
            }
        }
        else if (button>100) {
            for (; button >= 100; button--) {
                System.out.println(button);
            }
        }
    }
}