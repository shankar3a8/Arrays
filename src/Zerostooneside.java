
public class Zerostooneside {

	public static void main(String[] args) {
		int[] a= {0,2,5,8,0,1,4,7,0,3,6,9,0};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;i<a.length;i++) {
				if(a[i]==0&&a[j]!=0) {
					System.out.println(a[i]+"............");
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
//Wrong////////////////////////////////////////////////////////////////////////////////////////wrong//////////////////////////////