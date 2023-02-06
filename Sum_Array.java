package Array_2.o;

public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
			
		
			int sum=0;
			int avg=0;
		for(int i=0;i<a.length;i++)
		{

			sum=sum+a[i];
			avg=sum/a.length;
			
		}
		System.out.println("Sum of number : "+sum);
		System.out.println("Avg of number : "+avg);
	}

}
