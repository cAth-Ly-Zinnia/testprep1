/**
 * 
 */
package testPrep1;

/**
 * @author Takrak
 *
 */
public class fixedPay implements payBehavior {
	double payTotal;
	public int payHR(int hours, int payRate) {
		payTotal = hours * payRate;
		return (int) payTotal;
	}

}
