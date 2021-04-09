package com.test.wookyeong.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.wookyeong.address.DAO.AddressDAO;
import com.test.wookyeong.address.VO.AddressVO;



@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDAO addressDAO;

	@Override
	public List<AddressVO> listAdress() throws Exception {
		List<AddressVO> addressList = addressDAO.selectAllAddress();
		return addressList;
	}

	@Override
	public int insertAddress(AddressVO addressVO) throws Exception {
		int result = addressDAO.insertAddress(addressVO);
		return result;
	}

	@Override
	public List<AddressVO> viewAddress(int id) throws Exception {
		
		List<AddressVO> addressView= addressDAO.addressView(id);
		return addressView;
	}

	@Override
	public int modifyAddress(AddressVO addressVO) throws Exception {

		int result = addressDAO.modifyAddress(addressVO);
		return result;
	}

	@Override
	public int deleteAddress(int id) throws Exception {
		int result = addressDAO.deleteAddress(id);
		return result;
	}

}
