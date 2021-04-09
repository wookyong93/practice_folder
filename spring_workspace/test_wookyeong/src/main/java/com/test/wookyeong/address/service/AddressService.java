package com.test.wookyeong.address.service;

import java.util.List;

import com.test.wookyeong.address.VO.AddressVO;



public interface AddressService {

	public List<AddressVO> listAdress() throws Exception;

	public int insertAddress(AddressVO addressVO) throws Exception;

	public List<AddressVO> viewAddress(int id) throws Exception;

	public int modifyAddress(AddressVO addressVO)throws Exception;

	public int deleteAddress(int id)throws Exception;

}
