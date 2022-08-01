package telran.people.tests;

import java.util.function.Predicate;

import telran.people.Employee;
import telran.people.SalesPerson;

public class SalesPersonPredicate implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		
		return t instanceof SalesPerson;
	}

}
