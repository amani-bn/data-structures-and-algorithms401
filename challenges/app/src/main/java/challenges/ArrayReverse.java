package challenges;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverseArray(arr);
    }//end main()

    public static int [] reverseArray(int [] arr){
        System.out.print("[");
        for (int i=arr.length-1;i>=0;i--){
            if (i< arr.length-1) {
                System.out.print(", ");
            }// end if
            System.out.print(arr[i]);
        }// end for
        System.out.print("]");
        return arr;
    }// end reverseArray()
}//end class

