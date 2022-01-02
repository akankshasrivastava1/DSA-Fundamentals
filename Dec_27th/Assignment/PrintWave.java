package Dec_27th.Assignment;

public class PrintWave {
    public void wavePrint(int a[][]){
		System.out.println();
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
			}
		}
	}
    public static void main(String[] args)
	{
		PrintWave obj = new PrintWave();
		int[][] matrix = { {60,40,39,16},{ 58,41,38,18},{55,42,37,19} };
		obj.wavePrint(matrix);
	}
}
