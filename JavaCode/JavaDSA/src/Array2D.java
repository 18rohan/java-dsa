import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row = 0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        //Output
//        for(int row = 0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int row = 0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // Output new Syntax
        for(int a[]: arr){
            System.out.println(Arrays.toString(a));
        }


    }

}
