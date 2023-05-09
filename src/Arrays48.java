
public class Arrays48 {

	public static void main(String[] args) {
		int[] a= {12,35,69,47,52,15};
		int ct=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				ct++;
			}
		}
		int even[]=new int[ct];
		int odd[]=new int[a.length-even.length];
		int b=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				//System.out.println(a[i]);
				even[b]=a[i];
				b++;
			}
			else
			{
				//System.out.println(a[i]);
				odd[c]=a[i];
				c++;
			}
		}
		ct=0;
		for(int i=0;i<odd.length;i++)
		{
			a[i]=odd[i];
			ct++;
		}
		for(int i=0;i<even.length;i++)
		{
			a[ct]=even[i];
			ct++;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
