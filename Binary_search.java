package Array_2.o;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int ele=5;
		
		int start=0;
		int end=a.length-1;
		
		while(true)
		{
			int mid = start+end/2;
			
			if(a[mid]==ele)
			{
				System.out.println("found at index : "+mid);
				break;
			}
			if(ele>a[mid])
				start=mid+1;
			else if(ele<a[mid])
				end=mid-1;
			if(start>end)
			{
				
				System.out.println("not found");
				break;
			}
		}
	}

}
