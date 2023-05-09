
public class ArrayDuplicates {

	public static void main(String[] args) {
		int []a= {1,1,2,4,0,0,6,3,1,0,111,111,2,5,4};
		int output[]=new int[a.length]; 
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					output[i]=a[i];
					a[j]='o';
					
					//a[j]=9999;
				}
			//	System.out.println(output[j]);
			}
		}
		for(int i=0;i<output.length;i++)
		{
			if(output[i]!='o' || output[i]!=0)
			{
			System.out.println(output[i]);
			}
		}
		char a1='o';
		//System.out.println((int)a1);
}}