package multithreading;

class FirstThread1 extends Thread
{

	@Override
	public void run() {
	
		for(int i=0;i<3;i++)
		{
		System.out.println("Child Thread");
	}}
}


public class ThreadPriority {

	public static void main(String[] args) {

		FirstThread1 t=new FirstThread1();
		t.setPriority(5);
		t.start();
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Main Thread");
		}
	}

}
