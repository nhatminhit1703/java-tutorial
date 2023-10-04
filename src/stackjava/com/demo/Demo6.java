package stackjava.com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

//Function thường dùng với Stream khi muốn thay đổi giá trị cho từng phần tử trong stream.
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("stack", "JAVA", "demo", "Function");
		Stream<String> stream = list.stream();
		// chuyển tất cả các phần tử của stream thành chữ in hoa
		stream.map(new Function<String, String>() {
		  @Override
		  public String apply(String t) {
		    return t.toUpperCase();
		  }
		}).forEach(t -> System.out.println(t));
		System.out.println("---------------");
		// Function với cú pháp Lambda Expression
		// chuyển tất cả các phần tử của stream thành chữ thường
		stream = list.stream();// lưu ý là stream ko thể dùng lại nên phải khởi tạo lại
		stream.map(t -> t.toLowerCase()).forEach(t -> System.out.println(t));
	}

}
