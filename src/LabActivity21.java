
public class LabActivity21 {

	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,5,6};
			int b=a.length-1;
		if(a.length%2!=0) {
		for(int i=0,j=a.length-1;i<a.length&&j>=0;i++,j--)
		{
			//System.out.println(a[j]);
			if(i!=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}else {
				break;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		}else {
			for(int i=0,j=a.length-1;i<a.length&&j>=0;i++,j--)
			{
				//System.out.println(a[j]);
				if(i+1==j)
				{
					break;
				}else {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}
	}
}