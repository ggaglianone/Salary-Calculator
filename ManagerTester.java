import Programmer;
import Manager;

public class ManagerTester {
	
	public static void main(String args[]) {
		int testPassed = 0, testFailed = 0;
		Manager m1, m2, m3, m4, m5;
		m1 = new Manager(null, null, 4444.45678, 500.2389);
		m2 = new Manager(null, null, -4444.45, -1500.24);
		m3 = new Manager();
		m4 = new Manager();
		m5 = new Manager();
		
		Programmer p1, p2;
		p1 = new Programmer(null, null, 3333.45678);
		p2 = new Programmer(null, null, -123.45);
		if(m2.supervise(p1)) {
			testPassed++;
		} else { testFailed++; }
		if(m2.supervise(p2)) {
			testPassed++;
		} else { testFailed++; }
		if(m3.supervise(p2)) {
			testPassed++;
		} else { testFailed++; }
		if(m3.supervise(p1)) {
			testPassed++;
		} else { testFailed++; }
		
		System.out.println("Manager1 : \n" + m1);
		System.out.println("Manager2 : \n" + m2);
		System.out.println("Manager3 : \n" + m3);
		System.out.println("Added 2 Programmers to Managers 2 and 3 for next tests.");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Manager1 and Manager2\n");
		if(m1.equals(m2)) {
			System.out.println( "The two objects have the same data contents \n" );
			testFailed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testPassed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Manager2 and Manager3\n");
		if(m2.equals(m3)) {
			System.out.println( "The two objects have the same data contents \n" );
			testPassed++;
		} else {
			System.out.println( "The two objects do NOT have the same data contents \n" );
			testFailed++;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing equals method on Manager2.toString and Manager3.toString\n");
		if(m2.toString().equals(m3.toString())) {
			System.out.println( "The two Strings are the same.\n" );
			testPassed++;
		} else {
			System.out.println( "The two Strings are not the same.\n" );
			testFailed++;
		}
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing Supervise method with Null Reference.\n");
		if(m3.supervise(null)) {
			testFailed++;
		} else {
			System.out.println("Correctly ignored and not added.\n");
			testPassed++;
		}
		System.out.println("Testing Supervise method with Duplicate Value.\n");
		if(m3.supervise(p1)) {
			testFailed++;
		} else {
			System.out.println("Correctly ignored and not added.\n");
			testPassed++; 
		}
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("\nTesting equals method on empty objects.\n");
		if(m4.equals(m5)) {
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