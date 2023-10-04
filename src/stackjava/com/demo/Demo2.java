package stackjava.com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "name1", "address1"));
		customers.add(new Customer(2, "name2", "address1"));
		customers.add(new Customer(3, "name3", "address2"));
		customers.add(new Customer(4, "name4", "address2"));
		customers.add(new Customer(5, "name5", "address3"));
		customers.add(new Customer(6, "name6", "address3"));

		System.out.println("************* key = address, value = customer ************");

		Map<String, Customer> map = customers.stream()
				.collect(Collectors.toMap(Customer::getAddress, Function.identity(), (oldValue, newValue) -> newValue));
		map.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));
	}

}
