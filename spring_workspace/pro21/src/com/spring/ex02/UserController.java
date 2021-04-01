package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{
	/*
	 * public ModelAndView login(HttpServletRequest request,HttpServletResponse
	 * response) throws Exception{ String userID=""; String passwd=""; ModelAndView
	 * mav=new ModelAndView(); request.setCharacterEncoding("UTF-8");
	 * userID=request.getParameter("userID"); passwd=request.getParameter("passwd");
	 * 
	 * mav.addObject("userID",userID); mav.addObject("passwd",passwd);
	 * mav.setViewName("result"); //result.jsp 로 이동시켜주는 명령어 return mav; }
	 */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID = "";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("utf-8");
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");
		String viewName=getViewName(request);
		//getViewName 이란 메소드에 request를 넘겨주고  그 결과값을viewName 에 저장한다.
		mav.addObject("userID", userID);
		mav.addObject("passwd", passwd);
		//mav.setViewName("result");
		mav.setViewName(viewName);
		//viewName 의 JSP 페이지로 이동시킬수 있다.
	    System.out.println("ViewName:"+viewName);
		return mav;
	}
	public ModelAndView memberInfo(HttpServletRequest request,HttpServletResponse response) throws Exception{
			request.setCharacterEncoding("UTF-8");
			ModelAndView mav = new ModelAndView();
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			mav.addObject("id", id);
			mav.addObject("pwd", pwd);
			mav.addObject("name", name);
			mav.addObject("email", email);
			mav.setViewName("memberInfo");
			return mav;
	} 
	private String getViewName(HttpServletRequest request) throws Exception{
		String contextPath = request.getContextPath();
		String uri=(String)request.getAttribute("javax.servlet.include.request_uri");
		
		if(uri==null || uri.trim().equals("")) {
			uri=request.getRequestURI();
		}
		int begin =0;
		if(!((contextPath == null)||("".equals(contextPath)))){
			begin=contextPath.length();
		}
		int end;
		
		if(uri.indexOf(";")!=-1) {
			end=uri.indexOf(";");
		}else if(uri.indexOf("?")!=-1) {
			end=uri.indexOf("?");
		}else {
			end=uri.length();
		}
		
		String fileName = uri.substring(begin,end);
		if(fileName.indexOf(".")!=-1) {
			fileName=fileName.substring(0,fileName.lastIndexOf("."));
		}
		if(fileName.lastIndexOf("/")!=-1) {
			fileName= fileName.substring(fileName.lastIndexOf("/"),fileName.length());
		}
		return fileName;
	}
}
