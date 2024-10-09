import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.print("Enter first no: ");
        double num1 = scanner.nextDouble();
       
        System.out.print("Enter Second no: ");
        double num2 = scanner.nextDouble();
   
        double sum = num1+num2;
        System.out.println(sum);
    }
}
