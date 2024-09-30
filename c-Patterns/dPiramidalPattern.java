
import java.util.Scanner;

public class dPiramidalPattern {
    public static void main(String[] args) {
        System.out.print("Enter The Height Of Piramidal Pattern: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i;
        for(i=1; i<h; i++){
            int m=h-i+1;
            for(int l=1; l<=m; l++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}