/**
 * 
 */
package testPrep1;

/**
 * @author Takrak
 *
 */
public class Salary extends Employee {

	public Salary(String name, int payRate, int hours) {
		super(name, payRate, hours);
		setHours(40);
		PayBehavior = new fixedPay();
		// TODO Auto-generated constructor stub
	}
	
}
