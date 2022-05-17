package ai.jobiak.ioc;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void ride() {
		System.out.println("chal raha hai bike");

	}

}
