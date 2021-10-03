package com.janbask.interfaceExample;

public class ICICI implements ReserveBank
{

	public static void main(String[] args) {
		
ICICI i= new ICICI();
i.savings();
i.loan();
i.insurance();
	}

	@Override
	public void savings() {
		System.out.println("icici savings 2000$ ");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("icici loan interest is 4.3");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		
		System.out.println("icici insurance premium is 100$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locker() {
		// TODO Auto-generated method stub
		
	}

}
