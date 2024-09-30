
import java.util.Scanner;

public class dButterflyPattern {
    public static void main(String[] args) {
        System.out.print("Enter The Height Of Butterfly Pattern: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i;
        for(i=1; i<=h/2; i++){
            System.out.println();
            int n=i;
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            int m=h-i*2;
            for(int l=1; l<=m; l++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
        }
        for(i=h/2; i>=1; i--){
            System.out.println();
            int n=i;
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            int m=h-i*2;
            for(int l=1; l<=m; l++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
        }
    }
}
