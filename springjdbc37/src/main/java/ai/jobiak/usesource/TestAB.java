package ai.jobiak.usesource;

import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.BDigital;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class TestAB {

	public static void main(String[] args) {
BeanFactory	factory= new XmlBeanFactory(new FileSystemResource("beans.xml"));
		//B b=new B();
		/*
		B b=(B)factory.getBean("b");
		b.doPublishing();
		*/
		BDigital bDigital=(BDigital)factory.getBean("bDigital");
		bDigital.publish();
	}

}
