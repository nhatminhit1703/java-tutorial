package stackjava.com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Consumer thường được dùng với list, stream để xử lý với các phần tử bên trong.

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("stack", "java", "stackjava.com");
		// Sử dụng List.forEach(Consumer) để in ra giá trị của các phần tử trong list
		list.forEach(new Consumer<String>() {
		  @Override
		  public void accept(String t) {
		    System.out.println(t);
		  }
		});
		System.out.println("----------------");
		// Sử dụng List.forEach(Consumer) với cú pháp lambda expression:
		list.forEach(t -> System.out.println(t));
	}

}
