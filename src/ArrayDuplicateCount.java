
public class ArrayDuplicateCount {

	public static void main(String[] args) {
		int[] a= {1,5,6,2,4,5,5,5,8,7,9,3,111,111,111,111,111};
		int ct=1,ct1=0,b=0;
		for(int i=0;i<a.length-1;i++)
		{
			ct=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
					a[j]='o';
				}	
				
				}
			if(a[i]!='o')
			{
				if(ct1<ct)
				{
					ct1=ct;
					b=i;
					//ct=1;
					System.out.println(i);
				}
			}
		}
		System.out.println(ct1+"times"+a[b]);
	}
}