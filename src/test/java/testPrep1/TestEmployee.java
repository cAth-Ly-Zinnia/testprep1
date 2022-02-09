/**
 * 
 */
package testPrep1;

//import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Takrak
 *
 */
class TestEmployee {
	Employee a;
	Employee b;
	Employee c;
	
	Employee overtimeWorker;
	Employee contractorOvertime;
	Employee afterHoursSalary;
	
	arrEmp addArr;
	arrEmp addArr2;
		
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		a = new HourlyEmployee("John", 20, 40);
		b = new Salary("Joe", 40, 10);
		c = new Contractor("Business Man", 25, 40);
		addArr = new arrEmp(a);
		
		overtimeWorker = new HourlyEmployee("Jack Sparrow", 25, 60);
		contractorOvertime = new Contractor("Tom Brady", 30, 60);
		afterHoursSalary = new Salary("Olivia Rodrigo", 40, 60); 
		addArr2 = new arrEmp(overtimeWorker);
		//need to add these for get pay and toString and testSetEmployee
	}

	/*
	@Test
	void testEmployee() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	void testGetPay() {
		assertEquals(800, a.getPay());
		assertEquals(1600, b.getPay());
		assertEquals(1000, c.getPay());
		
		assertEquals(2687, overtimeWorker.getPay());
		assertEquals(1800, contractorOvertime.getPay());
		assertEquals(1600, afterHoursSalary.getPay());
		
		//try for salary
		//try for contractor
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetHours() {
		assertEquals(40, a.getHours());
		assertEquals(40, b.getHours());
		assertEquals(40, c.getHours());
		
		assertEquals(60, overtimeWorker.getHours());
		assertEquals(60, contractorOvertime.getHours());
		assertEquals(40, afterHoursSalary.getHours());
	}
	
	@Test
	void testToString() {
		assertEquals("Employee name=John, payRate=20, hours=40", a.toString());
		assertEquals("arrEmployee=[Employee name=John, payRate=20, hours=40], payEmployee=[800]", addArr.toString());
		//fail("Not yet implemented");
		assertEquals("Employee name=Jack Sparrow, payRate=25, hours=60", overtimeWorker.toString());
		assertEquals("arrEmployee=[" + overtimeWorker.toString() + 
				"], payEmployee=[" + overtimeWorker.getPay() + "]", addArr2.toString());
	}
	
	@Test
	void testSetEmployee() {
		addArr.setArrEmployee(b);
		//toString method implements both arrays of employees and pay for each position (might get confusing)
		assertEquals("arrEmployee=[" + a.toString() + ", " + b.toString() + "], "
				+ "payEmployee=[" + a.getPay() + ", " + b.getPay()+ "]"
				, addArr.toString());
		addArr2.setArrEmployee(contractorOvertime);
		assertEquals("arrEmployee=[" + overtimeWorker.toString() + ", " + contractorOvertime.toString() + "], "
				+ "payEmployee=[" + overtimeWorker.getPay() + ", " + contractorOvertime.getPay()+ "]"
				, addArr2.toString());
	}


}
