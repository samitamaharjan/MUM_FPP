package program_testApril2017;
import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> map = new HashMap<>();
		for (Student stu : students) {
			Key key = new Key(stu.getFirstName(), stu.getLastName());
			map.put(key, stu);
		}
		return map;
	}
}
