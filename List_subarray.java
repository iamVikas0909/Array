package Array_2.o;

public class List_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {3,7,90,1,4,58,6,5,};
		
		
		int size=3;
		
		 int min=a[0];
		 int index=0;
		 
		for (int i = 0; i <=a.length-size; i++) 
		{
			int sum=0;
			for (int j = i; j < i+size; j++)
			{
			    sum=sum+a[j];	
			}
			if(sum<min)
			{
				min=sum;
				index=i;
			}
		}
		System.out.println(index+" "+min);
	}

}
