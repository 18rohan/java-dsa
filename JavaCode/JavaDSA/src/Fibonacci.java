import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        int count = 2;

        while(count <= n){
            int temp = second;
            second = first + second;
            first = temp;
            count ++ ;
        }
        System.out.println("Fibonacci Number: "+second);
    }
}

// 0,1, ,1, 2, 3, 5, 8, 13