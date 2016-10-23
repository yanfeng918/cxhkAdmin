package com.xxzx.cxhk.dto.response;

import lombok.*;

import java.util.Date;

/**
 * Created by yanfeng on 2016/6/13.
 * 获取信息list
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCreditInfoListResponse {
    /**
     * 主键id
     */
    private int id;
    /**
     * 组织或者机构的名称
     */
    private String name;
    /**
     * 修改日期
     */
    private Date modifyDate;
    /**
     * 事项类别id
     */
    private int affairCategoryId;
    /**
     * 事项类别名称
     */
    private String affairCategoryName;
    /**
     * 修改人的id
     */
    private int modifyPersonId;
    /**
     * 修改人的名称
     */
    private String modifyPersonName;
    /**
     * 审核人的id
     */
    private int checkPersonId;
    /**
     * 审核人的名称
     */
    private int checkPersonName;
    /**
     * 审核的状态
     */
    private int status;

    /**
     * 审核的状态
     */
    private String statusValue;




}
