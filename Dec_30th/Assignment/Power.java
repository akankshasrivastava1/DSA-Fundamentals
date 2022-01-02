package Dec_30th.Assignment;
import java.util.Scanner;
// Write a recursive code to find the x^y . example: 2^5 = 32.
public class Power {
    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x, y));
        sc.close();
    }
}
