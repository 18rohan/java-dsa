// Remove Duplicates from sorted arrays
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

public class RemoveDuplicates {
    public static void main(String[] args) {
            int[] numbs = {0,0,1,1,1,2,2,3,3,4};

    }
//    Iterate through the array
//
    static int RemoveDuplicates(int[] arr){

      int pointerIndex =0;
        for (int number = 1; number < arr.length; number++) {
            if(arr[number] > arr[number-1]){
                pointerIndex++;
            }
            if(pointerIndex != number){
                arr[pointerIndex] = arr[number];
            }
        }
        return ++pointerIndex;
    }

}
