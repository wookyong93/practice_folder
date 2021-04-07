package com.spring.member.controller;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.member.service.MemberService;
import com.spring.member.vo.MemberVO;

public class MemberControllerImpl extends MultiActionController implements MemberController {
   private MemberService memberService;

   public void setMemberService(MemberService memberService) {
      this.memberService = memberService;
   }


   public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
      String viewName = getViewName(request);
      List membersList = memberService.listMembers();
      ModelAndView mav = new ModelAndView(viewName);
      mav.addObject("membersList", membersList);
      return mav;
   }
   
   public ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
      String viewName = getViewName(request);
      ModelAndView mav = new ModelAndView(viewName);
      return mav;
   }
   
   public ModelAndView memberDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
	   
      String id = request.getParameter("id");
      System.out.println(id);
      MemberVO vo = memberService.memberDetail(id);
      ModelAndView mav = new ModelAndView("memberDetail");
      mav.addObject("memberVO", vo);
      return mav;
   }
   
   public ModelAndView addMember(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
      request.setCharacterEncoding("utf-8");
      MemberVO memberVO = new MemberVO();
      
      bind(request, memberVO);
      
      int result = 0;
      result = memberService.addMember(memberVO);
      ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
      
      return mav;
   }
   
   public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
      request.setCharacterEncoding("utf-8");
      String id = request.getParameter("id");
      memberService.removeMember(id);
      ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
      return mav;
   }
   
   public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
      String viewName = getViewName(request);
      ModelAndView mav = new ModelAndView();
      mav.setViewName(viewName);
      return mav;
   }
   
   private String getViewName(HttpServletRequest request) throws Exception {
      String contextPath = request.getContextPath();
      String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
      if (uri == null || uri.trim().equals("")) {
         uri = request.getRequestURI();
      }

      int begin = 0;
      if (!((contextPath == null) || ("".equals(contextPath)))) {
         begin = contextPath.length();
      }

      int end;
      if (uri.indexOf(";") != -1) {
         end = uri.indexOf(";");
      } else if (uri.indexOf("?") != -1) {
         end = uri.indexOf("?");
      } else {
         end = uri.length();
      }

      String fileName = uri.substring(begin, end);
      if (fileName.indexOf(".") != -1) {
         fileName = fileName.substring(0, fileName.lastIndexOf("."));
      }
      if (fileName.lastIndexOf("/") != -1) {
         fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
      }
      return fileName;
   }
}