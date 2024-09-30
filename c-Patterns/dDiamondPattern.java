
public class dDiamondPattern {
    public static void main(String[] args) {
        int h = 4;
        int i;
        for(i=0; i<=h; i++){
            int m=h-i+1;
            for(int l=1; l<=m; l++){
                System.out.print("  ");
            }
            int k = i*2-1;
            for(int j=1; j<=k; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("   "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*");
        for(i=h-1; i>0; i--){
            int m=h-i+1;
            for(int l=1; l<=m; l++){
                System.out.print("  ");
            }
            int l = i*2-1;
            for(int j=1; j<=l; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

