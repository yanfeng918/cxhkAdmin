package com.xxzx.cxhk.dao.mbg;

import com.xxzx.cxhk.entity.Government;
import com.xxzx.cxhk.entity.GovernmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GovernmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int countByExample(GovernmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int deleteByExample(GovernmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int insert(Government record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int insertSelective(Government record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    List<Government> selectByExample(GovernmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    Government selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Government record, @Param("example") GovernmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Government record, @Param("example") GovernmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Government record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_government
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Government record);
}