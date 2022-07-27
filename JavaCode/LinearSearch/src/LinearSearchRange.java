public class LinearSearchRange {
    public static void main(String[] args) {
        System.out.println("Linear search Range");
        int[] numbs = {1,2,4,4,7,8,25};
        int res = LinearSearchRange(numbs,7, 1,5);
        System.out.println("Res: "+res);
    }
    //Linear search in an array for a range of index
    static int LinearSearchRange(int[] numbs, int target, int start, int end){
//        Check for empty array
        if(numbs.length == 0){
            return -1;
        }
//        Iterate through the range of indexes in an array
        for (int index = start; index <= end; index++) {
            if(numbs[index] == target){
                return index;
            }
        }
        return -1;
    }
}
