package Array_2.o;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] a= {33,55,44,88,99,55,22,11};

		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j = i;
			for (; j>0; j--)
			{
				if(temp<a[j-1])
				{
					a[j]=a[j-1]; 
				}

				else
				{


					break;   
				}
			}  
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
