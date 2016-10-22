package com.xxzx.cxhk.service.impl;

import com.xxzx.cxhk.bean.Pager;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
import com.xxzx.cxhk.entity.Info;
import com.xxzx.cxhk.service.CreditInfoService;
import org.springframework.stereotype.Service;

/**
 * Created by yanfeng on 16/10/22.
 */
@Service
public class CreditInfoServiceImpl implements CreditInfoService {
    /**
     * 获取信息列表
     *
     * @param request
     * @return
     */
    @Override
    public Pager<Info> list(GetCreditInfoListRequest request) {
        return null;
    }
}
