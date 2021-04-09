package com.spring.pro30.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ViewNameInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
				String viewName = getViewName(request);
				request.setAttribute("viewName", viewName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private String getViewName(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		//현재 패키지명까지의 주소값을 호출
		String uri=(String)request.getAttribute("javax.servlet.include.request_uri");
		//현제 호출된 uri를 String 값으로 호출한다.
		if(uri==null || uri.trim().equals("")) {
			uri=request.getRequestURI();
			//uri 정보가 없을경우 전달된 URI 값을 지정
		}
		int begin=0;
		if(!(contextPath==null)||(contextPath.equals(""))) {
			//contextPath의 값이 있을경우 
			begin=contextPath.length();
			//begin의 값을 contextPath의 length 값 부여한다 ;
		}
		int end;
		if(uri.indexOf(";")!=-1) {
			//uri에 ;의 위치가 -1일 경우 ;가 존재하지않는다.
			//-1이 아닐경우 ; 가 존재한다
			end=uri.indexOf(";");
			//end는 ;가 들어간 위치번호를 부여한다.
		}else if(uri.indexOf("?")!=-1) {
			//uri에 ?의 위차가 -1이 아닌경우
			end=uri.indexOf("?");
			//end는 ?가 들어간 위치번호를 부여한다.
		}else {
			end=uri.length();
			//end에 uri 문자열의 길이를 부여한다.
		}
		
		String fileName=uri.substring(begin,end);
		if(fileName.indexOf(".")!=-1) {
			fileName=fileName.substring(0,fileName.lastIndexOf("."));
			//uri 문자열 값에 . 이 존재하는경우 첫번째 문장부터 마지막.의  위치까지의 문자열을 반환한다.
		}
		if(fileName.lastIndexOf("/")!=-1) {
			fileName = fileName.substring(fileName.lastIndexOf("/",1),fileName.length());
			//fileName에 /로 종료되지 않을경우 /다음의 1번쨰 문자부터 fileName의 종료지점까지의 문자열을 반환한다.
		}
		return fileName;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
