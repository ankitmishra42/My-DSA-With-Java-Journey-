
import java.util.Scanner;

public class dSacePattern {
    public static void main(String[] args) {
        System.out.print("Enter The Height Of Pattern: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i;
        for(i=0; i<h; i++){
            int m=h-i;
            for(int l=1; l<=m; l++){
                System.out.print(" ");
            }
            for(int j=1; j<=h; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
