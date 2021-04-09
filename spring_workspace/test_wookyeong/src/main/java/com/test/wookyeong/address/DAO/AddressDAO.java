package com.test.wookyeong.address.DAO;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.test.wookyeong.address.VO.AddressVO;



public interface AddressDAO {
	public List<AddressVO> selectAllAddress() throws DataAccessException;

	public int insertAddress(AddressVO addressVO) throws DataAccessException;

	public List<AddressVO> addressView(int id) throws DataAccessException;

	public int modifyAddress(AddressVO addressVO)throws DataAccessException;

	public int deleteAddress(int id)throws DataAccessException;
}
