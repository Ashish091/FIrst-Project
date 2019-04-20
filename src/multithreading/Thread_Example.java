package multithreading;

class Thread1 implements Runnable
{

	@Override
	public void run() {

		System.out.println("Child Thread");
	}
	

}
public class Thread_Example {

	public static void main(String[] args) {
    
		Thread1 t=new Thread1();
		
		Thread t1=new Thread(t);
		t1.start();
		System.out.println(t1.getName());
		t1.setName("New Name");
		System.out.println(t1);
		System.out.println(t1.getName());
	}
}
