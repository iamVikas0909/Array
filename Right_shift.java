package Array_2.o;


public class Right_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {11,22,33,44,55,66};
		
		int temp= a[0];

		
		for(int i=0; i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
