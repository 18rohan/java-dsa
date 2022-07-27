public class LeetCodeFloorNumber {
    public static void main(String[] args) {
        int[] numbs = {1,3,5,6,8,12,14,16,19};
        int res = FindFloor(numbs, 0);
        System.out.println("Floor Number: "+res);
    }
    static int FindFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){
            return -1;
        }

        while(start<=end){
            int middle = start + (end-start)/2;
            if(target < arr[middle]){
                end = middle -1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return arr[end];
    }
}
