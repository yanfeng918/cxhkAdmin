package com.xxzx.cxhk.dao.mbg;

import com.xxzx.cxhk.entity.TemplateAttributeOption;
import com.xxzx.cxhk.entity.TemplateAttributeOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateAttributeOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int countByExample(TemplateAttributeOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int deleteByExample(TemplateAttributeOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int insert(TemplateAttributeOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int insertSelective(TemplateAttributeOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    List<TemplateAttributeOption> selectByExample(TemplateAttributeOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    TemplateAttributeOption selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TemplateAttributeOption record, @Param("example") TemplateAttributeOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TemplateAttributeOption record, @Param("example") TemplateAttributeOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TemplateAttributeOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_template_attribute_option
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TemplateAttributeOption record);
}