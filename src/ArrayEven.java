
public class ArrayEven {

	public static void main(String[] args) {
		int[] a= {2,5,9,8,7,6,3,1};
		for(int i=0,j=a.length-1;i<a.length && j>=0;i++,j--) {
			if(a[i]%2==0 &&a[j]%2!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
