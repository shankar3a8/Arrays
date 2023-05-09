
public class ArrayDuplicateSum {

	public static void main(String[] args) {
		int[] a= {1,2,6,5,7,1,8,98,6,5,1,2};
		int sum=0,ct=0;
		for(int i=0;i<a.length-1;i++)
		{ct=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					ct++;
					a[j]=0;
					if(ct==1) {
					sum+=a[i];
					
					}
				}	
			}
		}
		System.out.println(sum);
	}

}
