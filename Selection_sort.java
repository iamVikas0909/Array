package Array_2.o;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,8,6,8,4,12};
		
		for (int i = 0; i < a.length; i++)
		{
			int min=i;
		   for (int j = i+1; j < a.length; j++)
		   {
			 if(a[j]<a[min])
				 min=j;
			   
		}	
		   int temp=a[i];
		   a[i]=a[min];
		   a[min]=temp;
		}
		for (int i = 0; i < a.length; i++)
		{
		    System.out.print(a[i]+" ");	
		}
	}

}
