//package btp400.part1;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Employee {
	
	private String name_;
	private String email_;
	private double salary_;
	
	
	public Employee(){
		this(null, null, 0.00);
		
	}
	
	public Employee(String name, String email, double salary){
		setName(name);
		setAddress(email);
		setSalary(salary);
	}
	
	public void setName(String name){
		
		if(name!=null){
			
			name_=name;
		}
		else{
			
			name_="";
		}
	}
	
	public void setAddress(String add){
		
		if(add!=null){
			
			email_ = add;
		}
		else{
			
			email_ ="";
		}
	}
	
	public void setSalary(double sal){
		
		if(sal > 0){
			String temp = String.valueOf(sal);
			BigDecimal salary = new BigDecimal(temp);
			salary = salary.setScale(2, RoundingMode.HALF_UP);
			salary_ = salary.doubleValue();
		}
		else{
			
			salary_ = 0.00;
		}
	}
	
	public String getName(){
		
		return name_;
	}
	
	public String getAddress(){
		
		return email_;
	}
	
	public double getSalary(){
		
		return salary_;
	}
	
	public double getPay(){
		
		return salary_;
	}
	
	public String toString() {

	       String s;

	       s =    "*****************************************\n" +
	              "*           Employee Information        *\n" +
		          "*****************************************\n" +
	              "Name: " + name_ + "\n" +
	              "Email Address: " + email_ + "\n" +
	              "Salary: " + salary_ + "\n\n";

	       return s;
	    }
	
	 public boolean equals(Object a){
		 
	        boolean result = false; 
	        
	        if (a instanceof Employee){
	        	
				Employee a2 = (Employee)a;

				if (a2.name_.equals(name_) && a2.email_.equals(email_) && a2.salary_ == salary_)
				    result = true;
			}
	        
	        return result; 
	    }
	
	
}// End of Employee Class
