public class Main {
    public static void main(String[] args)
    {
        int[] numbs = {1,2,3,7,45,78,99,110,114,126};
        int target = 45;
        int ans = BinarySearch(numbs, target);
        System.out.println("Location Index: "+ans);

    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
         int end = arr.length - 1;

//  Iterating through the array
        while(start <= end){
//            Changing the middle element depending on whether the target element is smaller or greater than middle
            int middle = start + (end - start) / 2;

//            Condition:  If Target is greater than the value of the middle element
            if(target > arr[middle]){
                start = middle + 1;
            }
//            Condition: If value of target element is smaller thant the value of the middle element.
            else if(target < arr[middle]){
                end = middle - 1;
            } else {
//                Condition: If Value of target == Value of middle element
                return middle;
            }
        }

    return -1;
    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[0] < arr[end];
        //  Iterating through the array
        while(start <= end){
//            Changing the middle element depending on whether the target element is smaller or greater than middle
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                return middle;
            }

            if(isAscending){
                if(target > arr[middle]){
                    end = middle - 1;
                } else{
                    start = middle + 1;
                }
//            Condition: If value of target element is smaller thant the value of the middle element.
            } else {
                if(target > arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
             }
            }
            return -1;

    }
}