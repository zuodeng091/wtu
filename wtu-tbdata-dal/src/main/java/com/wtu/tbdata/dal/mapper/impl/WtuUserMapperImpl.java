package com.wtu.tbdata.dal.mapper.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wtu.tbdata.dal.mapper.BaseMapper;
import com.wtu.tbdata.dal.mapper.WtuUserMapper;
import com.wtu.tbdata.domain.WtuUser;
import com.wtu.tbdata.domain.WtuUserExample;

@Repository("wtuUserMapper")
public class WtuUserMapperImpl extends BaseMapper implements WtuUserMapper{
	
	public int countByExample(WtuUserExample example) {
		return 0;
	}

	public int deleteByExample(WtuUserExample example) {
		return 0;
	}

	public int deleteByPrimaryKey(Long id) {
		return 0;
	}

	public int insert(WtuUser record) {
		return 0;
	}

	public int insertSelective(WtuUser record) {
		return 0;
	}

	public List<WtuUser> selectByExample(WtuUserExample example) {
		return sqlSession.selectList("WtuUserMapper.selectByExample", example);
	}

	public WtuUser selectByPrimaryKey(Long id) {
		return null;
	}

	public int updateByExampleSelective(WtuUser record, WtuUserExample example) {
		return 0;
	}

	public int updateByExample(WtuUser record, WtuUserExample example) {
		return 0;
	}

	public int updateByPrimaryKeySelective(WtuUser record) {
		return 0;
	}

	public int updateByPrimaryKey(WtuUser record) {
		return 0;
	}

}
