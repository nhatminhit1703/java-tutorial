package stackjava.com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "name1", "address1"));
		customers.add(new Customer(2, "name2", "address1"));
		customers.add(new Customer(3, "name3", "address2"));
		customers.add(new Customer(4, "name4", "address2"));
		customers.add(new Customer(5, "name5", "address3"));
		customers.add(new Customer(6, "name6", "address3"));

		System.out.println("************* key = id, value = customer ************");
//		Map<Integer, Customer> map1 = customers.stream()
//				.collect(Collectors.toMap(Customer::getId, Function.identity()));
		// or
		 Map<Integer, Customer> map1 = customers.stream().collect(Collectors.toMap(x -> x.getId(), x -> x));
		map1.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));

		System.out.println("************* key = id, value = name ************");
//		Map<String, String> map2 = customers.stream().collect(Collectors.toMap(Customer::getAddress, Customer::getName));
//		map2.forEach((key, value) -> System.out.println("Key : " + key + " - Value : " + value));
	}

}
