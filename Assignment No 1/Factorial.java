import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sac = new Scanner(System.in);

        int num, fact = 1;
        System.out.print("Enter number: ");
        num = sac.nextInt();

        for(int i = 1; i <= num; i++){
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
