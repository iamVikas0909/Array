package Array_2.o;

public class unique_pair {
	public static void main(String[] args) {

		int a[]= {1,2,3,3};


		int uniquecnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}	
			if(cnt==0)
			{
				uniquecnt++;
			}
		}
		//System.out.println(uniquecnt);
		int[] uniquearray=new int[uniquecnt];

		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = 0; j < i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			{
				uniquearray[index++]=a[i];
			}
		}
		for (int k = 0; k < uniquearray.length; k++) {

		
		System.out.println(uniquearray[k]+" ");
		}
	}
}


