package Array_2.o;

import java.util.Arrays;

public class Left_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {11,22,44,55,77,88,44,99};


		int temp=a[a.length-1];

		for (int i = a.length-1; i < 0; i--)
		{
			a[i]= a[i-1];
		}

		a[0]=temp;

		//for (int i = 0; i < a.length; i++) 
		{
			System.out.print(Arrays.toString(a));	
		}
	}

}


