package Dec_24th.Assignment;

public class TimeComplexity {
    public static void main(String[] args) {

        //Constant Time Algorithms – O(1)
        System.out.println("Time Complexity - O(1)");
        int n = 10;
        System.out.println("input is: " + n); // It  takes a constant amount of time to run. It's not dependent on the size of n.
        
        //Constant time algorithms are (asymptotically) the quickest. Logarithmic time is the next quickest

        // Logarithmic Time Algorithms – O(log n) 
        System.out.println("Time Complexity - O(log n)");
        for (int i = 1; i <= n; i = i * 3){ // running time grows in proportion to the logarithm of the input (in this case, log to the base 3)
            System.out.println("Geekster" + i);
        }

        // Linear Time Algorithms – O(n) 
        System.out.println("Time Complexity - O(n)");
        for (int i = 0; i < n; i++) {
            System.out.println("Geekster" + i); // It will grow linearly with the size of its input
        }

        //N Log N Time Algorithms – O(n log n)
        System.out.println("Time Complexity - O(n log n)");
        for (int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++) { //The running time grows in proportion to n log n of the input
                System.out.println(" Geek " + i + " ster " + j);
            }
        }
    }
    
}
