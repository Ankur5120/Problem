import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number = scanner.nextInt();

         System.out.println("multiplication table for" + number + ";");
        for(int i = 0; i<=10;i++){
            System.out.println(number + " X " + i + " = " + (number*i));
        }
        scanner.close();
    }
}
