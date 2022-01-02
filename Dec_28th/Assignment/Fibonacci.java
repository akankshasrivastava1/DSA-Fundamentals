package Dec_28th.Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
                return 1;
            }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
        }
	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the N value:");
		    int n=sc.nextInt();
            System.out.print("Fibonacci Series of "+n+" numbers: ");
	        for(int i = 1; i <= n; i++){
		         System.out.print(fibonacciRecursion(i)+ " ");
            }
	        sc.close();
		}
    
}
