import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int n = 13839;
        int count = 0;
        while(n > 0){
            int remainder = n % 10;  // Getting the last digit by checking the remainder
            if(remainder == number){
                count++; // If the remainder matches the number we are looking for then we will increase the count
            }
            n = n / 10; // Dividing the number by 10, to get the remaining number other than the last digit
        }
        System.out.println(count);
    }
}
