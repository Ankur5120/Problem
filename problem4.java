import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculatehcf(num1,num2);
        int lcm = calculatelcm(num1,num2,hcf);

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int calculatehcf(int a , int b){
        if(b==0){
            return a;
        }else{
            return calculatehcf(b, a%b);
        }
    }
    public static int calculatelcm(int a,int b, int hcf){
        return (a*b)/hcf;
    }
}
