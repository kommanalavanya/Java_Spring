package ai.jobiak.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Hello objA = (Hello) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      Hello objB = (Hello) context.getBean("helloWorld");
	      objB.setMessage("I'm object b");
	      objB.getMessage();

	}

}
