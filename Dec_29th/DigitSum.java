package Dec_29th;

public class DigitSum {
    static int sumDigit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sumDigit(n / 10));
    }
 
   
    public static void main(String args[])
    {
        int num = 23456;
        int result = sumDigit(num);
        System.out.println("Sum of digits in " + num + " is " + result);
    }
}
