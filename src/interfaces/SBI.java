package interfaces;

public class SBI implements Bank {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compoundInterest() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		Bank b=new SBI();
		b.interest();
		b.compoundInterest();
	}

}
