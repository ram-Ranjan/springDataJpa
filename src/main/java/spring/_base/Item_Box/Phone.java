package spring._base.Item_Box;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value ="prototype" )
@Component
public class Phone implements Item {

	public void used() {

		System.out.println("Used for Talking");
	}

}
