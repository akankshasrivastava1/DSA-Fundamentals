package Dec_30th.Assignment;
import java.util.Scanner;
//Find GCD of two number using recursion. GCD(4,8) => 4.    
public class GCD {
    static int gcd(int num1, int num2) {
        if (num2 != 0){
           return gcd(num2, num1 % num2);
        } else{
           return num1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1, num2));
        sc.close();
    }
}
