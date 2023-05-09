
public class ArrayConsecutive {

	public static void main(String[] args) {
		int a[]= {0,0,0,1,1,0,0,1,1,1,1,0,0,1,1,0,0,0};
		int ct=1,ct1=0;
		for(int i=0;i<a.length-1;i++)
		{	
			if(a[i]==1) 
			{
				ct++;
			if(a[i]==a[i+1] )
			{
				
				if(ct1<ct)
				{
					ct1=ct;
					//if(a[i+2]==0)
					
				}
				
			}else
				ct=1;
		}
		}
		System.out.println(ct1);
	}

}
