package Array_2.o;

import java.util.ArrayList;

public class Leader_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		int a[]= {22,5,5,8,77,9};
		
        ArrayList<Integer> list= new ArrayList<>();
        
		for (int i = 0; i < a.length; i++) 
		{

			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]>a[i])
				{
					cnt++;
				    break;
				}
			}	
			if(cnt==0)
			{
				list.add(a[i]);
				//System.out.println(a[i]+" ");
			}
		}
		System.out.print(list);
	}

}
