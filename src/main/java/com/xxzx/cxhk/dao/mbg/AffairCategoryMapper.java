package com.xxzx.cxhk.dao.mbg;

import com.xxzx.cxhk.entity.AffairCategory;
import com.xxzx.cxhk.entity.AffairCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AffairCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int countByExample(AffairCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int deleteByExample(AffairCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int insert(AffairCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int insertSelective(AffairCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    List<AffairCategory> selectByExample(AffairCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    AffairCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AffairCategory record, @Param("example") AffairCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AffairCategory record, @Param("example") AffairCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AffairCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_affair_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AffairCategory record);
}