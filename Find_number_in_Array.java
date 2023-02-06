package Array_2.o;

public class Find_number_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,30};

		int num=30;
		int count=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
				break;
			}

		}
		if(count==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
	}

}
