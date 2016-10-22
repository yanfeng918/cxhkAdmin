package com.xxzx.cxhk.dao.mbg;

import com.xxzx.cxhk.entity.Info;
import com.xxzx.cxhk.entity.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int countByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int deleteByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int insert(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int insertSelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    List<Info> selectByExample(InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    Info selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Info record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Info record);
}