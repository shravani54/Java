import java.util.Scanner;

public class prime {
    static boolean isPrime(int n){
        if(n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args){

        Scanner sac = new Scanner(System.in);

        int num;
        System.out.print("Enter Number: ");
        num = sac.nextInt();

        if (isPrime(num)){
            System.out.println(num + " is Prime Number");
        }else {
            System.out.println(num + " is not Prime Number");
        }
    }
}
