package prob1;

import java.util.*;
import java.util.stream.Collectors;

import support_classes.Employee;
import support_classes.EmployeeTestData;
import support_classes.Trader;
import support_classes.TraderTransactTestData;
import support_classes.Transaction;

public class Problem1 {

	// Returns a list of Employees, sorted by name, whose zip code begins with
	// the digits 53
	public static List<Employee> zipBegins53(List<Employee> list) {
		// implement
		return list.stream().filter(e -> e.getAddress().getZip().startsWith("53"))
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		// return null;
	}

	// Returns a list of distinct Traders who work in a city different from
	// Cambridge, who conducted
	// a transaction in the year 2013. Output list of traders should be sorted
	// by name.
	public static List<Trader> getTraders(List<Transaction> list) {
		// implement
		return list.stream().filter(t -> t.getYear() == 2013 && !t.getTrader().getCity().equals("Cambridge"))
				.map(t -> t.getTrader()).distinct().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		// return null;
	}

	// test methods
	public static void main(String[] args) {
		testZipBegins53();
		testGetTraders();
	}

	private static void testZipBegins53() {
		List<Employee> list = EmployeeTestData.getList();
		// expected output:
		// [<name: Joe salary: 100000 year of birth: 1980>, <name: Ricardo
		// salary: 50000 year of birth: 1988>,
		// <name: Tim salary: 10000 year of birth: 1995>, <name: Tom salary:
		// 150000 year of birth: 1958>]
		System.out.println(zipBegins53(list));
	}

	private static void testGetTraders() {
		List<Transaction> list = TraderTransactTestData.getTransactions();
		// expected output:
		// [Trader:Mario in Milan, Trader:Raoul in Berkeley]
		System.out.println(getTraders(list));
	}

}
