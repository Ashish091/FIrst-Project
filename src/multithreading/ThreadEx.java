package multithreading;

class FirstThread extends Thread
{

	@Override
	public void run() {
	
		for(int i=0;i<3;i++)
		{
		System.out.println("FirstThread");
	}}
}

class SecondThread extends Thread
{

	@Override
	public void run() {
	 
		for(int i=0;i<3;i++)
		{
		System.out.println("SecondThread");
	}}
}
public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(new FirstThread());
		Thread t2=new Thread(new SecondThread());
		t1.start();
		
		t2.start();
	}

}
