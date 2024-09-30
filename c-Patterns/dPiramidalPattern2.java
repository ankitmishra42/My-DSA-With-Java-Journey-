
import java.util.Scanner;

public class dPiramidalPattern2 {
    public static void main(String[] args) {
        // System.out.print("Enter The Height Of Piramidal Pattern: ");
        // Scanner sc = new Scanner(System.in);
        // int h = sc.nextInt();
        int h=5;
        int i;
        int m=h+5;
        for(i=1; i<=h; i++){
            m = m-2;
            for(int l=1; l<=m; l++){
                System.out.print(" ");
            }

            int k=i;
            for(; k>1; k--){
                System.out.print(k+" ");
            }
            for(; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}