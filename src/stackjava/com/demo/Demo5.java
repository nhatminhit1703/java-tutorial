package stackjava.com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//Predicate thường được dùng với list, stream để kiểm tra từng phần tử lúc xóa, lọc…
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(1);
		list.add(0);
		list.add(-2);
		list.add(3);
		// lệnh removeIf sẽ thực hiện duyệt từng phần tử,
		// nếu method test của Predicate trả về true thì sẽ remove phần tử đó khỏi list
//		list.removeIf(new Predicate<Integer>() {
//		  @Override
//		  public boolean test(Integer t) {
//		    return t < 0;
//		  }
//		});
		list.removeIf(t -> t < 0);
		list.forEach(t -> System.out.println(t));
		System.out.println("-----------------------------");
		// Sử dụng Predicate với cú pháp Lambda Expression
		// loại bỏ các phần tử lớn hơn 1
		list.removeIf(t -> t > 1);
		list.forEach(t -> System.out.println(t));
	}

}
