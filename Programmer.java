//package btp400.part2;
import java.math.BigDecimal;
import java.math.RoundingMode;

import Employee;


public class Programmer extends Employee {
	private double overtime_;
	
	public Programmer(){
		
		super();
		overtime_ = 0.00;
	}
	
	public Programmer(String nm, String em, double sal){
		
		super(nm, em, sal);
		overtime_ = 0.00;
	}
	
	public boolean addOvertimePay(double ot){
		
		boolean result = false;
		
		if (ot > 0.00){
			
			if(overtime_ + ot <= super.getSalary() /2){
				
				String ot2 = String.valueOf(ot);
				BigDecimal overtime = new BigDecimal(ot2);
				overtime = overtime.setScale(2, RoundingMode.HALF_UP);
				overtime_ += overtime.doubleValue();
				result = true;
			}
		}
		
		return result;
	}
	
	public boolean setOvertimePay(double newOvertimePay){
		
		boolean result = false;
		
		if(newOvertimePay > 0.00){
			
			if(overtime_ + newOvertimePay <= super.getSalary() /2){
				
				String ot2 = String.valueOf(newOvertimePay);
				BigDecimal overtime = new BigDecimal(ot2);
				overtime = overtime.setScale(2, RoundingMode.HALF_UP);
				overtime_ = overtime.doubleValue();
				result = true;
			}
		}
				
		return result;
	}
	
	public double getOvertimePay(){
		
		return overtime_;
	}
	
	public double getPay(){
		
		return (super.getSalary() + overtime_);
	}
	
	public String toString(){
		
		String s;

	       s =    "*****************************************\n" +
	              "*           Programmer Information        *\n" +
		          "*****************************************\n" +
	              "Name: " + super.getName() + "\n" +
	              "Email Address: " + super.getAddress() + "\n" +
	              "Overtime: " + getOvertimePay() + "\n" +
	              "Salary: " + super.getSalary() + "\n\n";

	       return s;
	    
	}
	
	public boolean equals(Object a){
		 
        boolean result = false; 
        
        if (a instanceof Programmer){
        	
			Programmer a2 = (Programmer)a;
			
			if(super.equals(a)){
				
				if (a2.overtime_ == overtime_){
					result = true;
				}
			}
        }
        return result; 
    }
}//End of Programmer Class
