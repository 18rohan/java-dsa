public class FIrstAndLastPositionsLeetCode {
    public static int[] main(String[] args) {
        int[] numbs = {1,2,7,7,7,7,7,8,8};
        int[] ans = {-1,-1};
        int start = Search(numbs, 7, true);
        int end = Search(numbs,7,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int Search(int[] arr, int target, boolean findingFirstElement){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else{
//                Probable answer found
                ans = middle;
                if(findingFirstElement == true){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
