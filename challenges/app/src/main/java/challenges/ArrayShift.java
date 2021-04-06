package challenges;




public class ArrayShift {

    public static void insertShiftArray(int[] arr,int newNum){
        ArrayList<Integer>listOfNumbers=new ArrayList<>();
        int midIndex;
        if(arr.length%2==0){
            midIndex=arr.length/2;
        }
        else{
            midIndex=(arr.length/2)+1;
        }
        int i;
        for( i=0;i<midIndex;i++){

            listOfNumbers.add(arr[i]);
        }
        listOfNumbers.add(newNum);
        for( i=midIndex;i<arr.length;i++){

            listOfNumbers.add(arr[i]);
        }
        System.out.println(listOfNumbers);
    }

}



