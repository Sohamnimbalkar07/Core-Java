
//This app can use all types(class/interface...) avaialable from java.util package
import java.util.*;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for multiplication");
//1.5 aaa
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        // display result using printf
        System.out.printf("Result = %.3f %n", (num1 * num2));
    }
}
