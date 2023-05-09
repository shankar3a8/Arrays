
public class SubArrayReverse {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int k=3,ct=0,ct1=0,small=0,large=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				ct=0;
				for(int l=i;l<=j;l++) {
					ct++;
				}
				//System.out.println(j+"   "+(j-1)+"   "+(j-2));
				
				if(ct==3 ) {
					System.out.println("  "+j+"   "+(j-1)+"   "+(j-2));
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					ct1=0;
					for(int m=0;m<a.length;m++) {
						if(m!=j && m!=j-1 && m!=j-2) {
							ct1++;
							System.out.println(m+"    "+a[m]);
							if(ct1==1) {
								small=m;
							}
							else {
								large=m;
							}
						}
					}
					System.out.println(a[small]+"    "+a[large]);
					int temp1=a[small];
					a[small]=a[large];
					a[large]=temp1;
					System.out.println(a[small]+"    "+a[large]);
				}
				//break;
			}
			//break;
		}
		for(int i:a)
			System.out.print(i);
	}

}
