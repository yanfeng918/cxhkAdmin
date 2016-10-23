package com.xxzx.cxhk.service.impl;

import com.xxzx.cxhk.bean.Pager;
import com.xxzx.cxhk.dao.extend.CreditInfoExtendMapper;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
import com.xxzx.cxhk.dto.response.GetCreditInfoListResponse;
import com.xxzx.cxhk.entity.CreditInfo;
import com.xxzx.cxhk.service.CreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yanfeng on 16/10/22.
 */
@Service
public class CreditInfoServiceImpl implements CreditInfoService {


    @Autowired
    private CreditInfoExtendMapper creditInfoExtendMapper;

    /**
     * 获取信息列表
     * @param request
     * @return
     */
    @Override
    public Pager<GetCreditInfoListResponse> list(GetCreditInfoListRequest request) {
        request.webParamConvert();
        List<GetCreditInfoListResponse> creditInfoList = creditInfoExtendMapper.getCreditList(request);
        int creditInfoListCount = creditInfoExtendMapper.getCreditInfoListCount(request);
        Pager<GetCreditInfoListResponse> pager = new Pager<GetCreditInfoListResponse>();
        pager.setPageNumber(request.getPageNumber());
        pager.setPageSize(request.getPageSize());
        pager.setList(creditInfoList);
        pager.setTotalCount(creditInfoListCount);
        return pager;
    }
}
