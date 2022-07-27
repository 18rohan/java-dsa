import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(CalculateArmstrong(in.nextInt()));
    }
    static boolean CalculateArmstrong(int input){
        int original  = input;
        int sum = 0;

        while(input > 0){
            int remainder = input % 10;
            input = input / 10;
            sum += remainder*remainder*remainder;

        }
        System.out.println("Remainder: "+sum);
       return sum == original;
    }
}
