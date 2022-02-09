/**
 * 
 */
package testPrep1;

import java.util.ArrayList;

/**
 * @author Takrak
 *
 */
public class arrEmp {
	//only needed if to reference last employee
	//Employee emp;
	ArrayList<Employee> arrEmployee;
	ArrayList<Integer> payEmp;
	int total;
	public arrEmp(Employee emp) {
		// TODO Auto-generated constructor stub
		if (arrEmployee == null) {
			arrEmployee = new ArrayList<Employee>();
		}
		if (payEmp == null) {
			payEmp = new ArrayList<Integer>();
		}
		arrEmployee.add(emp);
		total = emp.getPay();
		payEmp.add(total);
	}
	/**
	 * @return the arrEmployee
	 */
	
	public void payEmployee(){
		payEmp.add(total);
	}
	
	public ArrayList<Employee> getArrEmployee() {
		return arrEmployee;
	}
	
	/**
	 * @param arrEmployee the arrEmployee to set and adds into payEmployee
	 */
	public void setArrEmployee(Employee addOn) {
		arrEmployee.add(addOn);
		total = addOn.getPay();
		payEmp.add(total);
	}
	
	/*
	public void setPayEmployee(Employee addOn) {
		total = addOn.getPay();
		payEmp.add(total);
	}*/
	/**
	 * @return the payEmp
	 */
	public ArrayList<Integer> getPayEmployee() {
		return payEmp;
	}
	
	@Override
	public String toString() {
		return "arrEmployee=" + arrEmployee + ", " + "payEmployee=" + payEmp;
	}

}
