
public class Arrays59SingleLoop {

	public static void main(String[] args) {
		int[] a= {15,3,8,16,95,98};
		int ct=0,i;
		for(i=0;i<a.length-1;i++)
		{
			ct=0;
			int j=i+1;
			if(a[i]<a[j]) {
				ct++;
				//continue;
			}
			if(ct==0)
				System.out.println(a[i]);
		}
		

	}

}
