package Array_2.o;

public class More_than_one_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,1,1,2,2,2,3,3,3,4,4,5,6};
		int[] b= {1,1,2};
		
		int uniqueCnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j] )
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				uniqueCnt++;	
			}
		}
		
	System.out.println(uniqueCnt);
		
		int c[] =new int[uniqueCnt];
		 int index=0;
		 
		for(int i=0;i<a.length;i++)
		{  int cnt=0;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j] && cnt<2)
		
		{
			cnt++;
		}
		}
		if(cnt==0)
		{
			c[index]=a[i];
			index++;
		}
		}
		for(int i=0;i<c.length;i++)
		{
			
			{
				System.out.print(c[i]+" ");
			}
		}
	}

}
