package com.wtu.tbdata.dal.mapper.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.wtu.tbdata.dal.mapper.BaseMapper;
import com.wtu.tbdata.dal.mapper.WtuUserMapper;
import com.wtu.tbdata.domain.WtuUser;
import com.wtu.tbdata.domain.WtuUserExample;

@Repository("wtuUserMapper")
public class WtuUserMapperImpl extends BaseMapper implements WtuUserMapper{

	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	
	public int countByExample(WtuUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(WtuUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(WtuUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(WtuUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<WtuUser> selectByExample(WtuUserExample example) {
		return sqlSessionFactory.openSession().selectList("WtuUserMapper.selectByExample", example);
	}

	public WtuUser selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByExampleSelective(WtuUser record, WtuUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(WtuUser record, WtuUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(WtuUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(WtuUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
