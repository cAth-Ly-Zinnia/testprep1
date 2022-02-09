/**
 * 
 */
package testPrep1;

/**
 * @author Takrak
 *
 */
public class Employee{
	
	payBehavior PayBehavior;
	String name;
	int payRate;
	int hours;

	public Employee(String name, int payRate, int hours) {
		this.name = name;
		this.payRate = payRate;
		this.hours = hours;
	}
	
	//gathers the pay of the employee
	public int getPay() {
		int total = PayBehavior.payHR(hours, payRate);
		return total;
	}
	
	//gathers the class of what payBehavior to give the employee
	public payBehavior getPayBehavior(payBehavior pb) {
		return pb;
	}
	
	//get the class of what payBehavior to set for the employee
	public void setPayBehavior(payBehavior pb) {
		PayBehavior = pb;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the payRate
	 */
	public int getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", payRate=" + payRate + ", hours=" + hours;
	}

}
