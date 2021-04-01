package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("lazy.xml");
		System.out.println("secondBean 얻기");
		context.getBean("secondBean");
		//lazy-init 가 true 이면 이런식으로 getBean 명령어로 호출해주어 생성된다. 
	}
}
