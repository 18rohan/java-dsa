public class LinearSearchImplementation {
    public static void main(String[] args) {
        System.out.println("Linear search");
        int[] numbs = {1,2,4,4,7,8,25};
        int res = LinearSearch(numbs, 12);


        System.out.println("Res: "+res);

    }
    static int LinearSearch(int[] arr, int target){
//        Checking for empty array
        if(arr.length == 0){
            return -1;
        }
//         Iterate through the array to find the target element
        for (int index = 0; index < arr.length; index++) {
//            Assigning the current element to variable "element"
            int element = arr[index];
//            Checking if the current element is equal to the target element
            if(element == target){
//                If the target element found, return the current index
                return index;
            }
        }
// If no element found in the array, return -1 which corresponds to "element not found"
        return -1;

    }





}

