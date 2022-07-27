public class LinearSearchMinimumElement {
    public static void main(String[] args) {
        System.out.println("Linear Search Minimum");
        int[] numbs = {1,5,9,3,-3,64};
        int res = LinearSearchMinimum(numbs);
        System.out.println("Result: "+res);
    }
    static int LinearSearchMinimum(int[] numbs){
//        Check for empty array
        if(numbs.length == 0){
            return -1;
        }
//        Declaring minimum variable
        int minimum = Integer.MAX_VALUE;
        for (int index = 0; index < numbs.length; index++) {
            if (numbs[index] < minimum) {
                minimum = numbs[index];

            }

        }
        return minimum;
    }
}
