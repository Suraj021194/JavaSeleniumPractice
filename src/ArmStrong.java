import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n != 0) {

       int digit = n%10;
       rev = rev + digit*digit*digit;
       n = n/10;
        }
        System.out.println(rev);

    }
}
