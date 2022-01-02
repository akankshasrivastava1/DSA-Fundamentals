package Dec_29th.Assignment;
//Reverse a number using a recursive program.

public class ReverseNumRecursion {
    public static void Reverse(int num)
    {
 
        if (num < 10) {
            System.out.println(num);
            return;
        }
 
        else {
            System.out.print(num % 10);
            Reverse(num / 10);
        }
    }
 
    public static void main(String args[]){
        int num = 58696;
        System.out.print("Reversed Number: ");
        Reverse(num);
    }
    
}
