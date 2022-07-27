public class MaximumWealth {
    public static void main(String[] args) {
        int[][] data = {{1,2,3},{3,2,1}};
        System.out.println("Data:"+data);
    }
    static int FindMaximumWealth(int[][] accounts){
//        person = row;
//        accounts = cols;
        int ans = Integer.MIN_VALUE;
        for (int rows = 0; rows < accounts.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                sum += accounts[rows][cols];

            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
