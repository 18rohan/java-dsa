import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int newNum = 0;

        while(number > 0){
            // To reverse a number, we are just going to divide the original number by 10, to get the remainder
            // Now we will multiply the new number by 10, and add the remainder so that the next remainder is added to the next corresponding place
            newNum = newNum*10 + (number % 10);
            number /= 10;
        }
        System.out.println(newNum);

    }
}
