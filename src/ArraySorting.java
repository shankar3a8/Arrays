
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,6,8,9,4,6,2,4,7,8};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
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
