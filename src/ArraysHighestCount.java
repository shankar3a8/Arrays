
public class ArraysHighestCount {

	public static void main(String[] args) {
		int[] a= {1,5,9,6,7,8,9,4,8,1,5,6,4,8,9};
		int ct=0,ct1=0;
		int b=0;
		for(int k=0;k<a.length-1;k++)
		{
			for(int j=k+1;j<a.length;j++)
			{
				if(a[k]>a[j])
				{
					a[k]=(a[k]+a[j])-(a[j]=a[k]);
				}
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				ct++;
				if(ct1<ct)
				{
					b=i;
					ct1=ct;
					ct=0;
				}
			}		
		}
			System.out.println(ct1+"times"+a[b]);
	}

}
