import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        Initialisation:  For 2D arrays, we need to initialise the array with an internal array
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
//        Add new elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
    }
}
