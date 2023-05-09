
public class Negativenumberstooneside {

	public static void main(String[] args) {
		int [] a= {-2,6,-5,4,9,-7,8,8,-9};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<0&&a[j]>0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
	}

}
