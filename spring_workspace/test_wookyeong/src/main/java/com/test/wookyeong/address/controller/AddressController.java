package com.test.wookyeong.address.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.wookyeong.address.VO.AddressVO;

public interface AddressController {
	public ModelAndView listAddress(HttpServletRequest request,HttpServletResponse response) throws Exception;
	public ModelAndView form(HttpServletRequest request,HttpServletResponse response) throws Exception;
	public ResponseEntity insertAddress(@ModelAttribute("addr") AddressVO addressVO , HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView addressView(@RequestParam("id") int id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ResponseEntity modifyAddress(@ModelAttribute("addr") AddressVO addressVO,HttpServletRequest request,HttpServletResponse response) throws Exception;
	public ResponseEntity deleteAddress(@RequestParam("id") int id, HttpServletRequest request,HttpServletResponse response)throws Exception;
}
