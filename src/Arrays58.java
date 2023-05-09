
public class Arrays58 {

	public static void main(String[] args) {
		int[] a= {15,25,69,48,15,24};
		int n=30,ct=0,j;
		for(int i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
			//	if(a[i]!=a[j])
				//{
					if(a[i]+a[j]==n)
					{
						ct++;
						//System.out.println("the sum of "+a[i]+" and "+a[j]+" = "+n);
						break;
					}
				//}
			}
			if(ct==1) {
				System.out.println("found at "+a[i]+" and "+a[j]);
				break;
			}
			}
		if(ct==0)
			System.out.println("no");
	}

}
