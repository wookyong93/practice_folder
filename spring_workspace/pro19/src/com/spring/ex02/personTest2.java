package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class personTest2 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		//person.xml 를 호출하고 
		//personService person = new PersonServiceImpl();
		//객체 생성시마다 새로운 객체를 만들지않아 프로그램이 가벼워 진다.
		PersonService person1 = (PersonService) factory.getBean("personService1");
		//person 에있는 personService의 아이디를 가지고 있는 빈을 호출하고
		person1.sayHello();
		System.out.println();
		//setName 값에 value 값 홍길동을 넣어 호출
		PersonService person2 =(PersonService) factory.getBean("personService2");
		person2.sayHello();
	}
}	
