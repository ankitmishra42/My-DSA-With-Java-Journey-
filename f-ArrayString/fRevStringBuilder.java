public class fRevStringBuilder {
    public static void main(String[] args){
        StringBuilder str1 = new StringBuilder("HelloTony");
        int i;
        System.out.println("BFORE REVERSING: "+str1);
        for (i=0; i<=str1.length()/2; i++){
            int front = i;
            int back = str1.length()-1-i;

            char frontChar = str1.charAt(front);
            char backChar = str1.charAt(back);

            str1.setCharAt(front, backChar);
            str1.setCharAt(back, frontChar);
        }
        System.out.println("OFTER REVERSING: "+str1);
    }
}
