package Array_2.o;

import java.util.Arrays;

public class Positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {2,4,-5,6,-7,8,-8,9,7};

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<0 && a[j]>0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println(Arrays.toString(a));
	}

}
