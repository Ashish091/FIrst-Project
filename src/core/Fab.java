package core;

public class Fab {

	public static void main(String[] args) {

		int t1=0,t2=1,n=10;
		System.out.println("first "+n+" terms");
		for(int i=0;i<=n;++i)
		{
			System.out.println(t1+" + ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}
