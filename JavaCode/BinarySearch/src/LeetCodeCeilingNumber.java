public class LeetCodeCeilingNumber {
    public static void main(String[] args) {
        int[] numbs = {1,3,5,7,9,12,14,16,18};
        int res = FindCeiling(numbs, 22);
        System.out.println("Ceiling Number: "+res);
    }
    static int FindCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        If the target element is greater than all the elements in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
//        Iterating through the array until start > end;
        while(start <= end){
//            Changing the values of middle, while dividing the array into parts
            int middle = start + (end - start)/2;
//          If the value of the target element is less than the middle element, then we look to the left of the middle element
            if(target < arr[middle]){
                end = middle - 1;
//                If the value of the target element is less than the middle element, we look to the right of the middle element.
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
//                If value of target element is equal to the middle element, we return the middle element
                return middle;
            }
        }
//        If the target element doesn't exist in the array, then the start element becomes greater than the end element. Hence, it becomes the smallest
//        element greater than the target element because the target element should exist between [start,.....,end], and if it doesn't exist so it becomes
//        [end,....,start] so start becomes greater than the target element.
        return arr[start];
    }
}
