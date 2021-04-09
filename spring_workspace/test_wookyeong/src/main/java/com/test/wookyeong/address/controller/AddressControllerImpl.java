package com.test.wookyeong.address.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.wookyeong.address.VO.AddressVO;
import com.test.wookyeong.address.service.AddressService;


@Controller("addressController")
public class AddressControllerImpl implements AddressController{
	@Autowired
	private AddressService addressService;
	@Autowired
	private AddressVO addressVO;
	@Override
	@RequestMapping(value="/address/addressList.do", method=RequestMethod.GET)
	public ModelAndView listAddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName =(String)request.getAttribute("viewName");
		List<AddressVO> addressList = addressService.listAdress();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("addressList",addressList);
		return mav;
	}
	@Override
	@RequestMapping(value="/address/*Form.do", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	@Override
	@RequestMapping(value="/address/insertAddress.do", method=RequestMethod.POST)
	public ResponseEntity insertAddress(AddressVO addressVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ResponseEntity resEnt=null; 
		HttpHeaders responseHeaders = new HttpHeaders();
		String message;
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("UTF-8");
			int result =0;
			result = addressService.insertAddress(addressVO);
			
			message = "<script>alert('주소 등록 성공');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
			
		}catch(Exception e) {
		
			message = "<script>alert('오류 발생 관리자에게 문의하세요');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
		}
		
		resEnt= new ResponseEntity(message,responseHeaders,HttpStatus.CREATED);
		
		return resEnt;
	}
	@Override
	@RequestMapping(value="/address/addressView.do",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addressView(int id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		List<AddressVO> addressView = addressService.viewAddress(id);
		mav.addObject("addressView",addressView);
		return mav;
	}
	@Override
	@RequestMapping(value="/address/modifyAddress.do", method=RequestMethod.POST)
	public ResponseEntity modifyAddress(AddressVO addressVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ResponseEntity resEnt=null; 
		HttpHeaders responseHeaders = new HttpHeaders();
		String message;
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		try {
			int result =0;
			result = addressService.modifyAddress(addressVO);
			message = "<script>alert('주소 수정 성공');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
		
		}catch(Exception e) {
		
			message = "<script>alert('오류 발생 관리자에게 문의하세요');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
		}
		
		resEnt= new ResponseEntity(message,responseHeaders,HttpStatus.CREATED);
		
		return resEnt;
	}
	@Override
	@RequestMapping(value="/address/deleteAddress.do",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity deleteAddress(int id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ResponseEntity resEnt=null; 
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		String message;
		
		try {
			int result =0;
			result = addressService.deleteAddress(id);
			message = "<script>alert('주소 삭제 성공');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
		
		}catch(Exception e) {
			message = "<script>alert('오류 발생 관리자에게 문의하세요');location.href='"+request.getContextPath()+"/address/addressList.do';</script>";
		}
		
		resEnt= new ResponseEntity(message,responseHeaders,HttpStatus.CREATED);
		
		return resEnt;
	}

}
