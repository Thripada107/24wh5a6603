import java.util.*;
public class IntegerDivision
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter Num1: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Num2: ");
            num2 = Integer.parseInt(sc.nextLine());
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}