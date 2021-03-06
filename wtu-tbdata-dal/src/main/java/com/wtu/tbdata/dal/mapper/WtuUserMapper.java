package com.wtu.tbdata.dal.mapper;

import com.wtu.tbdata.domain.WtuUser;
import com.wtu.tbdata.domain.WtuUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WtuUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int countByExample(WtuUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int deleteByExample(WtuUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int insert(WtuUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int insertSelective(WtuUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    List<WtuUser> selectByExample(WtuUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    WtuUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WtuUser record, @Param("example") WtuUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WtuUser record, @Param("example") WtuUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WtuUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wtu_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WtuUser record);
}