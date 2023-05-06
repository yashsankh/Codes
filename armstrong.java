import java.util.Scanner;
import java.lang.Math;

public class armstrong {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int n1, n2, sum = 0, count = 0,r;
        n1 = n;
        while (n > 0) {

            n = n / 10;
            count++;
        }
        n2 = n1;
        while (n1 > 0) {

            r = n1 % 10;
            sum = sum + (int) Math.pow(r, count);
            n1 = n1 / 10;
        }
        if (sum == n2) {
            System.out.println("Yes, the number is armstrong");
        } else {
            System.out.println("No, the number is not armstrong");

        }
    }

}
//Note:
// In this all jest of just 10's mutlipication /Division of 10 
//10 is magic and cool number in mathematics.