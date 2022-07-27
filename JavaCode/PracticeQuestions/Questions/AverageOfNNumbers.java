package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();

        }
        int Sum = 0;
        for (int i:arr ) {
            System.out.print(i + " ");
            Sum += i;
        }
        int Average =  Sum / arr.length;
        System.out.println();
        System.out.println("Average: " + Average);
    }
}
