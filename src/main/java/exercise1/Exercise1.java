package exercise1;
import java.util.*;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		Person qqun = new Person (name, age);
		return qqun;
	}

	public static void main(String[] args) {
		Person qqun = new Person(args[0], Integer.parseInt(args[1]));
		System.out.println(qqun.getName()+ " " + qqun.getAge());
	}
}
