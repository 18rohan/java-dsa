public class FindEven {
    public static void main(String[] args) {
        int[] numbs = {12,152,2,5234,125,35,44,45};
        int res = FindEven((numbs));
        System.out.println("Result: "+res);

    }
    static int FindEven(int[] numbs){
        int count = 0;
        for (int number:numbs
             ) {
            if(even2(number)){
                count++;
            }
        }
    return count;
    }

    static boolean even(int number){
//        Efficient Solutiobn
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        if(count % 2 == 0){
            return true;
        } else {
            return false;
        }
    }


//    Efficient solution: To find out the number of digits, instead of iterating we can calculate the log10 of the number and add 1 to it.((int)(Math.log10(number)) + 1)
    static boolean even2(int number){
//        Efficient Solutiobn
        int count = 0;
        if(number < 0){
            number = number * -1;
        }
        count = (int)(Math.log10(number)) + 1;

        if(count % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
