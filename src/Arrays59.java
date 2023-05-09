
public class Arrays59 {

	public static void main(String[] args) {
		int[] a= {15,3,8,16,95,98};
		int ct=0,i;
		for(i=0;i<a.length;i++)
		{
			ct=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j])
			{
				ct++;
				break;
			}
			}
			if(ct==1)
			{
				System.out.println("leader number is "+a[i]+" at "+i);
			}
			
		}
		
	}

}
