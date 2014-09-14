import Programmer;

public class ProgrammerTester {
	
	public static void main(String args[]) {
		int testPassed = 0, testFailed = 0;
		Programmer p1, p2, p3, p4 ,p5;
		p1 = new Programmer(null, null, 3333.45678);
		p2 = new Programmer(null, null, -123.45);
		p3 = new Programmer();
		p4 = new Programmer();
		p5 = new Programmer();
		
		System.out.println("Programmer1 : \n" + p1);
		System.out.println("Programmer2 : \n" + p2);
		System.out.println("Programmer3 : \n" + p3);
		
		System.out.println("\n-----------------------------------------\n");
		if(p1.getSalary() == 3333.46 && p1.getOvertimePay() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		if(p2.getSalary() == 0.00 && p1.getOvertimePay() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		if(p3.getSalary() == 0.00 && p1.getOvertimePay() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Programmer1 and Programmer2\n");
		if(p1.equals(p2)) {
			System.out.println( "The two objects have the same data contents \n" );
			testFailed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testPassed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Programmer2 and Programmer3\n");
		if(p2.equals(p3)) {
			System.out.println( "The two objects have the same data contents \n" );
			testPassed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testFailed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Programmer2.toString and Programmer3.toString\n");
		if(p2.toString().equals(p3.toString())) {
			System.out.println( "The two Strings are the same.\n" );
			testPassed++;
		} else {
			System.out.println( "The two Strings are not the same.\n" );
			testFailed++;
		}
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing Setters on Programmer2.\n");
		p2.setName("Balint Czunyi");
		p2.setAddress("BCzunyi@myseneca.ca");
		p2.setSalary(10500.75483);
		p2.setOvertimePay(3600.99135);
		p2.addOvertimePay(100.0045);
		if(p2.getName() == "Balint Czunyi") {
			System.out.println("Name Set. (Balint Czunyi) \n");
			testPassed++;
		} else { 
			System.out.println("Name Not Set. (" + p2.getName() + ")\n");
			testFailed++;
		}
		if(p2.getAddress() == "BCzunyi@myseneca.ca") {
			System.out.println("Email Set. (BCzunyi@myseneca.ca) \n");
			testPassed++;
		} else { 
			System.out.println("Email Not Set. (" + p2.getAddress() +") \n");
			testFailed++;
		}
		if(p2.getSalary() == 10500.75) {
			System.out.println("Salary Set. (10500.75483) \n");
			testPassed++;
		} else { 
			System.out.println("Salary Not Set. (" + p2.getSalary() + ") \n");
			testFailed++;
		}
		if(p2.getOvertimePay() == 3700.99) {
			System.out.println("Overtime Set. (3600.99135) \n");
			System.out.println("Overtime Added. (100.0045) \n");
			testPassed+=2;
		} else { 
			System.out.println("Overtime Not Set. (" + p2.getOvertimePay() + ") \n");
			testFailed+=2;
		}
		System.out.println("Programmer2 : \n" + p2);
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing invalid argument setters on Programmer3.\n");
		p3.setSalary(-6839.87201);
		if(p3.getSalary() == 0.00) {
			System.out.println("Salary Set. (0.00) Ignored negative (-6839.87201) \n");
			testPassed++;
		} else { 
			System.out.println("Salary Not Set. (" + p3.getSalary() + ") \n");
			testFailed++;
		}
		p3.setOvertimePay(-1000.55123);
		p3.addOvertimePay(-100.40123);
		if(p3.getOvertimePay() == 0.00) {
			System.out.println("Overtime Set. (0.00) ignored negative (-1000.55123) \n");
			System.out.println("Overtime Added. (0.00) ignored negative (-100.40123) \n");
			testPassed+=2;
		} else { 
			System.out.println("Overtime Not Set. (" + p3.getOvertimePay() + ") \n");
			testFailed+=2;
		}
		p3.setOvertimePay(1000.55123);
		p3.addOvertimePay(100.40123);
		if(p3.getOvertimePay() == 0.00) {
			System.out.println("Overtime Set. (0.00) ignored over 50% (1000.55123) \n");
			System.out.println("Overtime Added. (0.00) ignored over 50% (100.40123) \n");
			testPassed+=2;
		} else { 
			System.out.println("Overtime Not Set. (" + p3.getOvertimePay() + ") \n");
			testFailed+=2;
		}
		System.out.println("Programmer3 : \n" + p3);
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println("\nTesting equals method on empty objects.\n");
		if(p4.equals(p5)) {
			System.out.println( "The two objects have the same data contents \n" );
			testPassed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testFailed++;
		}
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		
	}
}
