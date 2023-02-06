package Array_2.o;

public class Matrix_sum_inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [][] b={ {1,2,3,4},
				{4,5,8,7},
				{8,7,5,4},
				{8,7,5,6},
		};

		int sum=0;
		int cnt=0;
		int avg=0;
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if(i!=0 && i!=3 && j!=0 && j!=3)
				{
					sum=sum+b[i][j];
					cnt++;
				}
			}	
		}
		System.out.println(sum);
		avg=sum/cnt;
		System.out.println(avg);
	}

}
