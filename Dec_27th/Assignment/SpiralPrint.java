package Dec_27th.Assignment;

public class SpiralPrint {
    public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 12, 23, 34, 56 }, { 12, 46, 6, 2 }, { 7, 4, 2, 8 }, { 1, 42, 65, 2 } };
		int top = 0;
		int left = 0;
		int bottom = arr.length - 1;
		int right = arr[0].length - 1;
		int direction = 0;

		while (top <= bottom && left <= right) {

			if (direction == 0) {

				for (int i = left; i <= right; i++) {
					System.out.println(arr[top][i]);
				}
				top++;
				direction = 1;
			} else if (direction == 1) {

				for (int i = top; i <= bottom; i++) {
					System.out.println(arr[i][right]);
				}
				right--;
				direction = 2;
			} else if (direction == 2) {
				for (int i = right; i >= left; i--) {
					System.out.println(arr[bottom][i]);
				}
				bottom--;
				direction = 3;
			} else if (direction == 3) {
				for (int i = bottom; i >= top; i--) {
					System.out.println(arr[i][left]);
				}
				left++;
				direction = 0;
			}
		}

	}
    
}
