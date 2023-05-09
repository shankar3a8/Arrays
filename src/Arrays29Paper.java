
public class Arrays29Paper {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,5,6,7,11,12,14,20};
		int b=6;
	//	System.out.println(b);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==b)
				{
					System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}
	}

}
