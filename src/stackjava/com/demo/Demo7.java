package stackjava.com.demo;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Stream<Integer> stream = Stream.generate(new Supplier<Integer>() {
		  @Override
		  public Integer get() {
		    return random.nextInt(10);
		  }
		}).limit(5);
		stream.forEach(t -> System.out.print(t +" "));
		System.out.println("\n--------------------");
		// Sử dụng Supplier với cú pháp Lambda Expression:
		stream = Stream.generate(() -> random.nextInt(10)).limit(5);
		stream.forEach(t -> System.out.print(t +" "));
	}

}
