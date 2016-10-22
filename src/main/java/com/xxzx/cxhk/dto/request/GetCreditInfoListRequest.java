package com.xxzx.cxhk.dto.request;


import com.xxzx.cxhk.dto.BasePagerRequestDto;

/**
 * Created by yanfeng on 16/6/11.
 */
public class GetCreditInfoListRequest extends BasePagerRequestDto {

    private String mobile;

    private String community;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
}
