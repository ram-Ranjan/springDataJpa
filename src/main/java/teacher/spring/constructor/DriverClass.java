package teacher.spring.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
		Teacher teacher =  applicationContext.getBean("teacher",Teacher.class);
		
		Teacher teacher2 = applicationContext.getBean("teacher2",Teacher.class);
		
		System.out.println(teacher);
		System.out.println(teacher2);

		
		
	}

}
