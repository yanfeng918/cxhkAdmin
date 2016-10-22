package com.xxzx.cxhk.service;

import com.xxzx.cxhk.bean.Pager;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
import com.xxzx.cxhk.entity.CreditInfo;
import com.xxzx.cxhk.entity.Info;

/**
 * Created by yanfeng on 2016/6/12.
 */
public interface CreditInfoService {

    /**
     * 获取信息列表
     * @param request
     * @return
     */
    Pager<CreditInfo> list(GetCreditInfoListRequest request);




}
