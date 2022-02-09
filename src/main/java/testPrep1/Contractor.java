package testPrep1;

public class Contractor extends Employee{

	public Contractor(String name, int payRate, int hours) {
		super(name, payRate, hours);
		PayBehavior = new fixedPay();
		// TODO Auto-generated constructor stub
	}

}
