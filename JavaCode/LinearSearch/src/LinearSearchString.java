public class LinearSearchString {
    public static void main(String[] args) {
        System.out.println("Linear search String");
        String str = "Rohan";
        boolean res = LinearSearchChar(str,'t');
        System.out.println("Res: "+res);
    }
    //    Linear search for a Character in a string
    static boolean LinearSearchChar(String str, char target){
//        Check for empty array
        if(str.length() == 0){
            return false;
        }
//        Convert String to array, and iterate through the array to find the target element
        for (char i:str.toCharArray()
        ) {
            if(i == target){
                return true;
            }

        }
        return false;
    }

}
