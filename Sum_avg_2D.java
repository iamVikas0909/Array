package Array_2.o;

public class Sum_avg_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b = {{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int sum=0;
		int cnt=0;
		
		for (int i = 0; i < b.length; i++)
		{
			
			for (int j = 0; j < b.length; j++)
			{
			     sum=sum+b[i][j];
			     cnt++;			
			}
		
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
	}

}
