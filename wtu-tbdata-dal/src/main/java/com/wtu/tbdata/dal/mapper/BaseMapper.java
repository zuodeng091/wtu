package com.wtu.tbdata.dal.mapper;

import com.wtu.tbdata.common.spring.SpringContextHolder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义sqlsession
 * @author zuodeng 作者
 */
public class BaseMapper {

    /**
     * 加入日志
     */
    private static Logger logger = LoggerFactory.getLogger(BaseMapper.class);

    /**
     * sqlSession
     */
    protected static SqlSession sqlSession;

    /**
     * 加载类的时候初始化sqlSession
     */
    static {
        SqlSessionFactory sqlSessionFactory = SpringContextHolder.getBean("sqlSessionFactory");
        if(sqlSessionFactory == null){
            logger.info("spring加载sqlSessionFactory失败");
        }else{
            sqlSession = sqlSessionFactory.openSession();
            if(sqlSession != null){
                logger.info("spring成功加载sqlSession");
            }
        }
    }

}
