package Array_2.o;

public class Triplet_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,22,33,44};

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int k = j+1; k < a.length; k++)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);	
				}
			}	
		}
	}

}

