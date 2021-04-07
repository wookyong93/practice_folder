package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
public class LoginCotroller {
	@RequestMapping(value = { "/test/loginForm.do", "/test/loginForm2.do" }, method = RequestMethod.GET)
	// 여러개의 맵핑 주소를 {} 를 사용해서 맵핑할수 있따.
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}

	/*
	 * @RequestMapping(value="/test/login.do",method=
	 * {RequestMethod.GET,RequestMethod.POST}) //메서드 방식을 {} 를 사용하여 get,post 방식을 사용할
	 * 수 잇따. public ModelAndView login(HttpServletRequest request ,
	 * HttpServletResponse response) throws Exception {
	 * request.setCharacterEncoding("UTF-8"); ModelAndView mav = new ModelAndView();
	 * mav.setViewName("result"); String userID = request.getParameter("userID");
	 * String userName = request.getParameter("userName");
	 * mav.addObject("userID",userID); mav.addObject("userName",userName);
	 * 
	 * return mav; }
	 */
	/*
	 * @RequestMapping(value="/test/login2.do",method=
	 * {RequestMethod.GET,RequestMethod.POST}) //메서드 방식을 {} 를 사용하여 get,post 방식을 사용할
	 * 수 잇따. public ModelAndView login2(@RequestParam(value="userID") String
	 * userID, @RequestParam(value="userName",required = true)String
	 * userName, @RequestParam(value="email",required = false) String email
	 * ,HttpServletRequest request , HttpServletResponse response) throws Exception
	 * { request.setCharacterEncoding("UTF-8"); ModelAndView mav = new
	 * ModelAndView(); mav.setViewName("result");
	 * 
	 * String userID = request.getParameter("userID"); String userName =
	 * request.getParameter("userName");
	 * 
	 * System.out.println("userID : "+userID);
	 * System.out.println("name : "+userName); System.out.println("email : "+email);
	 * mav.addObject("userID",userID); mav.addObject("userName",userName);
	 * 
	 * return mav; }
	 */
	/*
	 * @RequestMapping(value="/test/login3.do",method=
	 * {RequestMethod.GET,RequestMethod.POST}) //메서드 방식을 {} 를 사용하여 get,post 방식을 사용할
	 * 수 잇따. public ModelAndView login2(@RequestParam Map<String,String> info
	 * ,HttpServletRequest request , HttpServletResponse response) throws Exception
	 * { request.setCharacterEncoding("UTF-8"); ModelAndView mav = new
	 * ModelAndView(); mav.setViewName("result");
	 * 
	 * String userID = request.getParameter("userID"); String userName =
	 * request.getParameter("userName");
	 * 
	 * String userID = info.get("userID"); String userName = info.get("userName");
	 * System.out.println("userID : "+userID);
	 * System.out.println("name : "+userName); mav.addObject("info",info);
	 * mav.setViewName("result");
	 * 
	 * 
	 * return mav; }
	 */
	/*
	 * @RequestMapping(value="/test/login4.do",method=
	 * {RequestMethod.GET,RequestMethod.POST}) //메서드 방식을 {} 를 사용하여 get,post 방식을 사용할
	 * 수 잇따. public ModelAndView login2(@ModelAttribute("info") LoginVO loginVO
	 * ,HttpServletRequest request , HttpServletResponse response) throws Exception
	 * { //@modelattribute를 이용하여 전달되는 값을 loginVO클레스와 이름이 같은속성에 자동으로 설정된다. addObject를
	 * 이용할 필요없이 info를 이용해 바로 JSP 에서 LoginVO속성에 접근할수 있다.
	 * request.setCharacterEncoding("UTF-8"); ModelAndView mav = new ModelAndView();
	 * mav.setViewName("result");
	 * 
	 * String userID = request.getParameter("userID"); String userName =
	 * request.getParameter("userName");
	 * 
	 * 
	 * System.out.println("userID : "+loginVO.getUserID());
	 * System.out.println("name : "+loginVO.getUserName());
	 * mav.setViewName("result");
	 * 
	 * 
	 * return mav; }
	 */
	@RequestMapping(value="/test/login5.do", method= {RequestMethod.GET , RequestMethod.POST})
	public String login5(Model model,HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("UTF-8");
		model.addAttribute("userID","hong");
		model.addAttribute("userName","홍길동");
		return "result";
	}
}

