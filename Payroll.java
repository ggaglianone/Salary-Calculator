//Gabriel Gaglianone
//package seneca.finance;
import java.util.ArrayList;

import btp400.part1.Employee;
import btp400.part2.Programmer;
import btp400.part3.Manager;


public class Payroll {
	
	private ArrayList<Employee> employees_ = new ArrayList<Employee>();
	
	public Payroll(){
		
	}
	public Payroll(Employee[] emp){
		
		if(emp!= null){
			
			for (int i = 0 ; i < emp.length ; i++){
				employees_.add(emp[i]);
			}
		}
	}
	
	public int size(){
		
		return employees_.size();
	}
	
	public boolean addEmployee(Employee employee){
		
		boolean result = false;
		if(employee != null){
			if(!employees_.contains(employee)){
				employees_.add(employee);
				result = true;
			}
		}
		return result;
	}
	
	public Employee removeEmployee(String employeeName, String emailAddress){
		
		Employee result = null;
		
		for (int i = 0 ; i < employees_.size() ; i++){
			
			if(employeeName.equals(employees_.get(i).getName()) && emailAddress.equals(employees_.get(i).getAddress()) ){
				
				result = employees_.get(i);
				employees_.remove(employees_.get(i));
			} 
		}
		return result;
	}
	
	public String toString() {
		
		String s =
				"*****************************************\n" + "* Payroll Information *\n" + "*****************************************\n";
		if(employees_.size() != 0) {
			
			for(Object o : employees_) {
				
				if(o instanceof Manager) {
					
					Manager m = (Manager) o;
					s += "Name: " + m.getName() + "\n" + "Total: $" + String.format("%.2f",m.getPay()) + " MNGR\n\n"; 
					}
				else if(o instanceof Programmer) {
					
					Programmer p = (Programmer) o;
					String ot ="";
					if(p.getOvertimePay() > 0.00){
						ot = " OVTP";
						}
					s += "Name: " + p.getName() + "\n" + "Total: $" + String.format("%.2f",p.getPay()) + ot + "\n\n"; 
					}
				else if(o instanceof Employee) {
					
					Employee e = (Employee) o; s += "Name: " + e.getName() + "\n" + "Total: $" + String.format("%.2f",e.getPay()) + "\n\n";
					}
				}
			} else {
				
				s += "No Employees are on this Payroll.\n\n"; 
				}
		
		return s;
		}
	
}//End of Payroll Class
