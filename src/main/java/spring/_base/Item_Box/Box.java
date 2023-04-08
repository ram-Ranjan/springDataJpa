package spring._base.Item_Box;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Box {
	
	@Qualifier("phone")
	@Autowired
	private Item item;
	public void itemUsed()
	{
		System.out.print("The item is used for : ");
		item.used();
	}

}
