import java.util.Scanner;

public class Aumnics1 {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter max no");
		int maxNo=s.nextInt();
		System.out.println("enter max no");
		int minNo=s.nextInt();
		int[] a=new int[maxNo-minNo];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter a number");
			a[i]=s.nextInt();
		}
		for(int i=minNo;i<=maxNo;i++) {
			flag=true;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(i+" ");
		}
		System.out.println("");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=(a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		int ct=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				ct++;
			}else {
				if(ct>=3) {
					System.out.println(a[i]);
				}
				ct=1;
			}
			if(i==a.length-2) {
				if(ct>=3)
					System.out.println(a[i]);
			}
		}
//		for(int i:a)
//			System.out.println(i);
	}

}
