package Array_2.o;

public class UniqueSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {2,4,5,7,8,6,2,4,4,8,5,2,};
		int uniquecnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)

			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				uniquecnt++;
			}

		}
		System.out.println(uniquecnt);
	}

}
