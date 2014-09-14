import Employee;
public class EmployeeTester {
	
	public static void main(String args[]) {
		int testPassed = 0, testFailed = 0;
		Employee e1, e2, e3, e4, e5;
		e1 = new Employee(null, null, 123.45678);
		e2 = new Employee(null, null, -123.45);
		e3 = new Employee();
		e4 = new Employee();
		e5 = new Employee();
		
		System.out.println("Employee1 : \n" + e1);
		System.out.println("Employee2 : \n" + e2);
		System.out.println("Employee3 : \n" + e3);
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("\nThe getSalary method returns: \n" +
							String.format("%.2f", e1.getSalary()) + "\n" +
							String.format("%.2f", e2.getSalary()) + "\n" +
							String.format("%.2f", e3.getSalary()) + "\n" +
							"for Employees 1, 2 and 3. \n");
		if(e1.getSalary() == 123.46) {
			testPassed++;
		} else { testFailed++; }
		if(e2.getSalary() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		if(e3.getSalary() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		System.out.println("\nThe getPay method returns: \n" +
							String.format("%.2f", e1.getPay()) + "\n" +
							String.format("%.2f", e2.getPay()) + "\n" +
							String.format("%.2f", e3.getPay()) + "\n" +
							"for Employees 1, 2 and 3. \n");
		if(e1.getPay() == 123.46) {
			testPassed++;
		} else { testFailed++; }
		if(e2.getPay() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		if(e3.getPay() == 0.00) {
			testPassed++;
		} else { testFailed++; }
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Employee1 and Employee2\n");
		if(e1.equals(e2)) {
			System.out.println( "The two objects have the same data contents \n" );
			testFailed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testPassed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Employee2 and Employee3\n");
		if(e2.equals(e3)) {
			System.out.println( "The two objects have the same data contents \n" );
			testPassed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testFailed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Employee2.toString and Employee3.toString\n");
		if(e2.toString().equals(e3.toString())) {
			System.out.println( "The two Strings are the same.\n" );
			testPassed++;
		} else {
			System.out.println( "The two Strings are not the same.\n" );
			testFailed++;
		}
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("\nTesting equals method on empty objects.\n");
		if(e4.equals(e5)) {
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