
public class LabActivity26 {

	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,5,6,8};
		if(a.length%2==0)
		{
			System.out.println((a[a.length/2]+a[a.length/2-1])/2);
		}else {
			System.out.println(a[a.length/2]);
		}
	}

}
