import java.util.Scanner;

public class fArray {
    public static void main(String[] args) {
        System.out.print("Enter The Number That You Want To Seach: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[]{5,10,15,20,25,30,35,40,45,50};
        int i;
        for (i=0; i<arr.length; i++) {
            if (arr[i] == x){
                System.out.println(x+" Found at index "+i);
                break;
            }
        }
        if (i >= arr.length) {
            System.out.println(x+" Not Found Any where into the Array! Try Again");
        }
    }
}