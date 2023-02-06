package Array_2.o;



public class Secound_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,7,8,6,1,5};

		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)

			if(a[i]>max)
				max=a[i];

		System.out.println(max);

		int secoundmax=Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
			if(a[i]!=max && a[i]>secoundmax)
				secoundmax=a[i];
				
		System.out.println(secoundmax);

	}

}
