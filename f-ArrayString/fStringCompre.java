import java.util.Scanner;

public class fStringCompre {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Frist String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Your Second String: ");
        String str2 = sc.nextLine();
        if (str1.compareTo(str2) == 0){
            System.out.println(str1+" AND "+str2+" ARE EQUAL");
        }
        else if (str1.compareTo(str2) >= 0) {
            System.out.println(str1+" IS GTATER THAN "+str2);
        }
        else if (str1.compareTo(str2) <= 0) {
            System.out.println(str1+" IS LESS THAN "+str2);
        }
    }
}

// Strngs Are immmutable in java