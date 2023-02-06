package Array_2.o;

public class Addition_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2},
				{2,1}
		};


		int b[][]= {{1,2},
				{1,2}
		};

		int c[][]=new int[a.length][b.length];
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				c[i][j]=a[i][j]+b[i][j]	;
			}	
		}
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");	
			}	
			System.out.println();
		}

	}

}
