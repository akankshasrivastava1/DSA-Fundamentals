package Dec_30th.Assignment;
import java.util.Scanner;
//Sort the string composed of only [a-z] chars in descending order in Linear Time. 
public class CharDescending {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
		String str = sc.nextLine();
 
        int letters[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int x =  str.charAt(i) - 'a';
            letters[x]++;
        }
 
        for (int i = letters.length - 1; i >= 0; i--) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }
        sc.close();
	}
}

