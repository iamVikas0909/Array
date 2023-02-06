package Array_2.o;

import java.util.Arrays;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {2,4,6,7,9,5,8,7,3};
			
			int evenarraySize=0;
			int oddarraySize=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
					evenarraySize++;
				else
					oddarraySize++;
			}
			int evenarray[]=new int[evenarraySize];
			int oddarray[]=new int[oddarraySize];
			
			int evenindex=0;
			int oddindex=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					evenarray[evenindex++]=a[i];
				}
				else
				{
					oddarray[oddindex++]=a[i];
				}
				
			}
			System.out.println("Even index :"+evenindex);
			System.out.println("Odd index : "+oddindex);
			System.out.println(Arrays.toString(evenarray));
			System.out.println(Arrays.toString(oddarray));
	}

}
