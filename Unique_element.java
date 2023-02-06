 package Array_2.o;

import java.util.Arrays;

public class Unique_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {11,22,11,88,33,22,33,44,11,55};

		int uniquecount=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				uniquecount++;
			}
		}
		System.out.println(uniquecount);
		int index=0;
		int [] b=new int[uniquecount];

		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				b[index++]=a[i];
			}

		}
		System.out.println(Arrays.toString(b));
		
		int i=0;
		int j=b.length-1;
		
		while(i<j)
		{
			int temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(b));
		
	}

}
