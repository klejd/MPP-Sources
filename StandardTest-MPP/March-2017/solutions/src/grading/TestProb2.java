package grading;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import prob2.Account;
import prob2.Admin;
import prob2.CheckingAccount;
import prob2.Employee;
import prob2.SavingsAccount;

public class TestProb2 extends TestCase {
	public void testImplementation() {
		final int EXPECTED_BAL = 1286;
		Account[] someCheckingAccounts = new CheckingAccount[2];
		someCheckingAccounts[0] = new CheckingAccount("231-471", 25.00, 100);
		someCheckingAccounts[1] = new CheckingAccount("446-973", 25.00, 200);
		Account[] someSavingsAccounts = new SavingsAccount[3];
		someSavingsAccounts[0] = new SavingsAccount("44-8123", 0.03, 200);
		someSavingsAccounts[1] = new SavingsAccount("21-9672", 0.03, 200);
		someSavingsAccounts[2] = new SavingsAccount("68-0902", 0.04, 600);
		
		
		Employee e1 = new Employee("Joe");
		Employee e2 = new Employee("Ralph");
		Employee e3 = new Employee("Tom");
		
		e1.addAccount(someCheckingAccounts[0]);
		e1.addAccount(someSavingsAccounts[0]);
		e2.addAccount(someCheckingAccounts[1]);
		e2.addAccount(someSavingsAccounts[1]);
		e3.addAccount(someSavingsAccounts[2]);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		assertEquals("Expected balance is " + EXPECTED_BAL, EXPECTED_BAL, 
				(int)Admin.computeUpdatedBalanceSum(employees));
	}
}
