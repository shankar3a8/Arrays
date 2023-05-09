
public class EvenOddArray {

	public static void main(String[] args) {
		int [] a= {5,7,14,25,8,6};
		int m=0,n;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				m++;
			}
		}
		int j=0,k=0;
		n=a.length-m;
		int [] even=new int[m];
		int [] odd=new int[n];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[j]=a[i];
				j++;
			}else {
				odd[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<even.length;i++)
			System.out.println(even[i]);
		System.out.println("");
		for(int i=0;i<odd.length;i++)
			System.out.println(odd[i]);
	}

}
