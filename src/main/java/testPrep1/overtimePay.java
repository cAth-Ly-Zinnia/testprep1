package testPrep1;

public class overtimePay implements payBehavior {
	double payTotal = 0;
	public int payHR(int hours, int payRate) {
		// hourly employee
		//System.out.println("Hourly Employee");
		if (hours > 40) {
			double bonus = (hours - 15) * (1.5 * payRate);
			payTotal = (40 * payRate) + bonus;
		}
		else {
			payTotal = hours * payRate;
		}
		
		return (int) (payTotal);
	}

}
