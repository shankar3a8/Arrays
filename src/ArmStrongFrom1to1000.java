
public class ArmStrongFrom1to1000 {

	public static void main(String[] args) {
		int a=1,d=0,sum=0,count=0;
		while(a<1000) {
			if(a<10) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=d;
					//System.out.println(sum);
				}
				if(sum==a) {
					count++;
				}
				
			}else if(a<100) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=(d*d);
	//				System.out.println(sum);
				}
				if(sum==a) {
					count++;
				}
//				sum=0;
//				a++;
			}else if(a<1000) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=(d*d*d);
//				System.out.println(sum);
				}
				if(sum==a) {
					count++;
				}
//				sum=0;
//				a++;
			}
			sum=0;
			a++;
		}
//		System.out.println(ct);
		int[] b=new int[count];
		a=1;d=0;sum=0;count=0;
		while(a<1000) {
			if(a<10) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=d;
					//System.out.println(sum);
				}
				if(sum==a) {
					b[count]=a;
					count++;
					
				}
				
			}else if(a<100) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=(d*d);
	//				System.out.println(sum);
				}
				if(sum==a) {
					b[count]=a;
					count++;
				}
//				sum=0;
//				a++;
			}else if(a<1000) {
				for(int i=a;i>0;i=i/10) {
					d=i%10;
					sum+=(d*d*d);
//				System.out.println(sum);
				}
				if(sum==a) {
					b[count]=a;
					count++;
				}
//				sum=0;
//				a++;
			}
			sum=0;
			a++;
		}
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}

}
