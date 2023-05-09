
public class Arrays35 {

	public static void main(String[] args) {
		int[] a= {12,-5,-5,-95,-48};
		int ct=0;
		int fneg=0,lpos = 0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<0)
		{
			fneg=a[i];
			ct++;
			break;
		}
		}
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>0)
			{
				lpos=a[i];
				ct++;
				break;
			}
		}
			if(ct==0)
				System.out.println("no +ve number");
		
		if(fneg<0&&lpos>0) {	
		int sum=fneg+lpos;
		System.out.println(sum);
	}
		else
			System.out.println("either no positive or negative number");
	}

}
