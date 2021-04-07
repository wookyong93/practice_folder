package com.spring.ex01;
//<context:component-scan base-package="com.spring"></context:component-scan> 으로지정한 패키지안에 있어야한다.

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController")
//클레스르 빈으로 생성하고 빈의 id 를 mainController로 지정해준다.
//<bean id = "mainCotroller" class="com.spring.ex01.MainController"> 와 같은 의미입니다.
@RequestMapping("/test")
//해당클레스를 불러올 맵핑이다. 
public class MainController {
	@RequestMapping(value="/main1.do" ,method=RequestMethod.GET)
	// 클래스맵핑 즉 /test 를 호출하고 그안에 메소드를 호출할 맵핑이다 . value 는 맵핑 값이고 메소드는 GET방식인지 POST 방식인지 확인한다.
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","main1");
		mav.setViewName("main");
		return mav;
	}
	@RequestMapping(value="/main2.do" ,method=RequestMethod.GET)
	// 클래스맵핑 즉 /test 를 호출하고 그안에 메소드를 호출할 맵핑이다 . value 는 맵핑 값이고 메소드는 GET방식인지 POST 방식인지 확인한다.
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","main2");
		mav.setViewName("main");
		return mav;
	}
}
