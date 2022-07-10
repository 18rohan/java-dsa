import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();

        switch(empId){
            case 1:
                System.out.println("Employee 1");
                break;
            case 2:
                System.out.println("Employee 2");
                break;
            case 3:
                System.out.println("Employee 3");
                switch(dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter a valid department");
                }
            default:
                System.out.println("Enter a valid EmpId");

        }
    }
}
