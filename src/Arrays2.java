
public class Arrays2 {

	public static void main(String[] args) {
		int []a= {949,732,671,595,730};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if((a[i]%4==0)||(a[i]%7==0))
			{
				sum+=a[i];
			}
		}
		double avg=(double)sum/a.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
