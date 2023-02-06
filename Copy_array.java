package Array_2.o;

public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		
		int b[]=new int [a.length];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}	
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}

}
