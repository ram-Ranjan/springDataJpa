package spring._base.Item_Box;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Item {

	public void used() {

		System.out.println("Used for Writing");
	}

}
