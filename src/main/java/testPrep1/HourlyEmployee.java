package testPrep1;

public class HourlyEmployee extends Employee{

	public HourlyEmployee(String name, int payRate, int hours) {
		super(name, payRate, hours);
		PayBehavior = new overtimePay();
		// TODO Auto-generated constructor stub
	}
	
}
