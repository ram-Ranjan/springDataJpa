package teacher.spring.constructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teacher {
	
	private String name;
	private int age;
	private int salary;
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("");
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Teacher(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	

}
