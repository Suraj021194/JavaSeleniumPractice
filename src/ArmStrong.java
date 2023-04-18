public class ArmStrong {
    public static void main(String[] args) {

        int n = 169;
        int rev = 0;

        while (n != 0) {

       int digit = n%10;
       rev = rev + digit*digit*digit;
       n = n/10;
        }
        System.out.println(rev);

    }
}
