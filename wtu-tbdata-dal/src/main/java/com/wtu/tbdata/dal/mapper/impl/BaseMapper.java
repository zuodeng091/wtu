package com.wtu.tbdata.dal.mapper.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定义sqlsession
 * @author zuodeng 作者
 */
@Component
public class BaseMapper {

    /**
     * 加入日志
     */
    private static Logger logger = LoggerFactory.getLogger(BaseMapper.class);

    /**
     * sqlSession
     */
    @Resource(name = "sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession;

    /**
     * 加载类的时候初始化sqlSession
     */
    public BaseMapper(){
        if(sqlSessionFactory == null){
            logger.info("spring加载sqlSessionFactory失败");
        }else{
            sqlSession = sqlSessionFactory.openSession();
            if(sqlSession != null){
                logger.info("spring成功加载sqlSession");
            }
        }
    }

    /**
     * 获取sqlSession
     * @return 返回
     */
    public SqlSession getSqlSession(){
        return sqlSession;
    }

}
