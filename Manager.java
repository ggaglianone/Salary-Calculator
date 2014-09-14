//package btp400.part3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import Employee;
import Programmer;


public class Manager extends Employee{
	
	private double baseBonus_;
	private double totalBonus_;
	private ArrayList<Programmer> programmers_ = new ArrayList<Programmer>();
		
	public Manager(){
		
		super();
		baseBonus_ = 0.00;
		totalBonus_ = baseBonus_;
	}
	public Manager(String nm, String em, double sal, double bb){
		
		super(nm, em, sal);
		if(bb > 0.00){
			
			String bb2 = String.valueOf(bb);
			BigDecimal bonus = new BigDecimal(bb2);
			bonus = bonus.setScale(2, RoundingMode.HALF_UP);
			baseBonus_ = bonus.doubleValue();
		}
		else{
			
			baseBonus_ = 0.00;
		}
		totalBonus_ = baseBonus_;
	}
	
	public boolean supervise(Programmer pgr){
		
		boolean result = true;
		if(pgr != null){
			
			for( Programmer p : programmers_){
				
				if(pgr.equals(p)){
					
					result = false;
				}
			}
			if (result == true){
				
				programmers_.add(pgr);
				totalBonus_ *= 0.99;
				String tb = String.valueOf(totalBonus_);
				BigDecimal totalBonus = new BigDecimal (tb);
				totalBonus = totalBonus.setScale(2,RoundingMode.HALF_UP);
				totalBonus_ = totalBonus.doubleValue();
				
			}
		}
		else{
			result = false;
		}
		return result;
	}
	
	public double getBaseBonus(){
		
		return baseBonus_;
	}
	
	public double getBonusPay(){
		
		return totalBonus_;
	}
	
	public double getPay(){
		
		int pgrs = 0;
		for (Programmer  p : programmers_){
			
			if(p.getOvertimePay() > 0.00){
				
				pgrs++;
			}
		}
		
		totalBonus_ = baseBonus_ * (1 - 0.01 * pgrs);
		return totalBonus_ + super.getSalary();
		
	}
	
public String toString(){
		
		String s;

	       s =    "*****************************************\n" +
	              "*           Manager Information        *\n" +
		          "*****************************************\n" +
	              "Name: " + super.getName() + "\n" +
	              "Email Address: " + super.getAddress() + "\n" +
	              "Base Bonus: " + getBaseBonus() + "\n" +
	              "Total Bonus: " + getBonusPay() + "\n" +
	              "Supervising: " + programmers_.size() + " Programmers \n" +
	              "Salary: " + super.getSalary() + "\n\n";

	       return s;
	    
	}

	public boolean equals(Object a){
	 
    boolean result = false; 
    
    if (a instanceof Manager){
    	
		Manager a2 = (Manager)a;
		
		if(super.equals(a)){
			
			if (a2.baseBonus_ == baseBonus_){
				
				result = true;
			}
		}
		for(Employee e : programmers_){
			
			if(!a2.programmers_.contains(e)){
				
				result = false;
			}
		}
    }
    
    return result; 
}	
	
}//End of Manager Class
