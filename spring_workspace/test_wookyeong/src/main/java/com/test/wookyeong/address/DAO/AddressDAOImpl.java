package com.test.wookyeong.address.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.test.wookyeong.address.VO.AddressVO;



@Repository("addressDAO")
public class AddressDAOImpl implements AddressDAO{
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<AddressVO> selectAllAddress() throws DataAccessException {
		List<AddressVO> addressList = sqlSession.selectList("mapper.addr.selectAllAddress");
		return addressList;
	}
	@Override
	public int insertAddress(AddressVO addressVO) throws DataAccessException {
		int result = 0;
		result = sqlSession.insert("mapper.addr.insertAddress",addressVO);
		return result;
	}
	@Override
	public List<AddressVO> addressView(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		List<AddressVO> addressView = sqlSession.selectList("mapper.addr.addressView",id);
		return addressView;
	}
	@Override
	public int modifyAddress(AddressVO addressVO) throws DataAccessException {
		int result = sqlSession.update("mapper.addr.modifyAddress",addressVO);
		return result;
	}
	@Override
	public int deleteAddress(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		int result = sqlSession.delete("mapper.addr.deleteAddress",id);
		return result;
	}

}
