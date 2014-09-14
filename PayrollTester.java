import Employee;
import Programmer;
import Manager;
import Payroll;

public class PayrollTester {
	
	public static void main(String args[]) {
		int testPassed = 0, testFailed = 0;
		Employee[] emp = new Employee[4];		
		emp[0] = new Programmer("John Doe", null, 5035.99456);
		((Programmer)emp[0]).addOvertimePay(200.00);
		emp[1] = new Programmer("Mark Sloan", null, 5678.00);
		emp[2] = new Manager("Joyce Hughs", null, 7376.75123, 500.2389);
		emp[3] = new Employee("Josh Gosling", null, 2000.00123);
		
		Payroll pr1, pr2;
		pr1 = new Payroll();
		pr2 = new Payroll(emp);
		String expected =	"*****************************************\n" +
							"* Payroll Information *\n" +
							"*****************************************\n" +
							"Name: John Doe\n" +
							"Total: $5235.99 OVTP\n\n" +
							"Name: Mark Sloan\n" +
							"Total: $5678.00\n\n" +
							"Name: Joyce Hughs\n" +
							"Total: $7876.99 MNGR\n\n" +
							"Name: Josh Gosling\n" +
							"Total: $2000.00\n\n";
		
		System.out.println("Payroll1: \n" + pr1);
		System.out.println("Payroll2: \n" + pr2);
		if(pr2.toString().equals(expected)) {
			testPassed+=4;
		} else { testFailed+=4; }
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Testing Methods on Payroll1.\n\n");
		System.out.println("Adding Employees one by one, duplicates and Null pointers.\n\n");
		if(pr1.addEmployee(emp[0])) {
			testPassed++;
		} else { testFailed++; }
		if(pr1.addEmployee(emp[1])) {
			testPassed++;
		} else { testFailed++; }
		if(pr1.addEmployee(emp[2])) {
			testPassed++;
		} else { testFailed++; }
		if(!pr1.addEmployee(null)) {
			testPassed++;
			System.out.println("Ignored Null Pointer as expected.\n\n");
		} else { testFailed++; }
		if(!pr1.addEmployee(emp[2])) {
			testPassed++;
			System.out.println("Ignored Duplicate Employee as expected.\n\n");
		} else { testFailed++; }
		if(pr1.addEmployee(emp[3])) {
			testPassed++;
		} else { testFailed++; }
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("Payroll1: \n" + pr1);
		System.out.println("Removing Mark and Josh from Payroll1.\n\n");
		pr1.removeEmployee("Mark Sloan", "");
		pr1.removeEmployee("Josh Gosling", "");
		
		expected =	"*****************************************\n" +
				"* Payroll Information *\n" +
				"*****************************************\n" +
				"Name: John Doe\n" +
				"Total: $5235.99 OVTP\n\n" +
				"Name: Joyce Hughs\n" +
				"Total: $7876.99 MNGR\n\n";
		
		if(pr1.toString().equals(expected)) {
			testPassed+=2;
			System.out.println("Removed as expected.\n\n");
		} else { testFailed+=2; }
		System.out.println("Payroll1: \n" + pr1);
		System.out.println("Tests Passed: " + testPassed + " Tests Failed: " + testFailed +"\n");
		
		System.out.println("\n-----------------------------------------\n");
		
	}
}