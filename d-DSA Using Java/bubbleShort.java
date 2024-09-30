public class bubbleShort{
    public static void main(String args[]){
        int[] arr = new int[]{6,1,9,7,5,11,2,8,4,3};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                // swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+", ");
        }
    }
}