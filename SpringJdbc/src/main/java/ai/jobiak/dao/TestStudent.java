package ai.jobiak.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbc-beans.xml");
		   StudentDao dao=(StudentDao) context.getBean("s1");
		   System.out.println(dao.insertRow());

	}

}
