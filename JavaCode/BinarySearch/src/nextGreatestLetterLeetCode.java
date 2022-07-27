public class nextGreatestLetterLeetCode {
    public static void main(String[] args) {
        char[] chars = {'c','g','j'};
        char res = nextGreater(chars, 'g');
        System.out.println("Greater character: "+res);
    }
     static char nextGreater(char[] chars, char target){
        int start = 0;
        int end = chars.length - 1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target < chars[middle]){
                 end = middle - 1;
            } else{
                start = middle + 1;
            }


        }
        return chars[start % chars.length];
     }
}
