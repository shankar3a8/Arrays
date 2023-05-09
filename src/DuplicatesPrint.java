
public class DuplicatesPrint {

	public static void main(String[] args) {
		int[] a= {1,2,5,4,5,2,1,3};
		int ct=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				ct++;
			}else if(ct>0) {
				System.out.println(a[i]+" "+ct);
				ct=0;
			}
			if((i+1==a.length-1)&&ct>0) {
				System.out.println(a[i]+" "+ct);
			}
		}
	}

}
