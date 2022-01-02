package Dec_20th.Assignment;

public class SquareRoot {
    public static int mySqrt(int x) {
    long start = 0, end = x, res = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long mulMid = mid * mid;

            if (mulMid == x)
                return ((int) mid);
            if (mulMid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
                res = mid;
            }
        }
        return ((int) res);
    
}
public static void main(String[] args){
       
    int  x = 8;
    int find = mySqrt(x);
    System.out.println(find);
}
}