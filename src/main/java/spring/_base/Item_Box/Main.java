package spring._base.Item_Box;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configs.class);
		
		Box box = applicationContext.getBean("box",Box.class);
		//box.itemUsed();
		Phone phone=applicationContext.getBean("phone",Phone.class);
		System.out.println(phone);
		Phone phone2=applicationContext.getBean("phone",Phone.class);
		System.out.println(phone2);
		
//		Item item = applicationContext.getBean("pen",Item.class);
//		item.used();
		
		
	}

}
