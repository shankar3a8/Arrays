
public class OddNumbersInDescendingOrder {

	public static void main(String[] args) {
		int[] a= {1,2,3,5,4,7,10};
		int ct=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				ct++;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
			if(a[i]%2==0 && a[j]%2!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		for(int i=0;i<ct;i++) {
			for(int j=i+1;j<ct;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}		
//		System.out.println(ct);
	for(int i:a)
		System.out.println(i);
	}
}
