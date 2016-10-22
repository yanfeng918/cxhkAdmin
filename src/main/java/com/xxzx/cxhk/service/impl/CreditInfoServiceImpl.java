package com.xxzx.cxhk.service.impl;

import com.xxzx.cxhk.bean.Pager;
import com.xxzx.cxhk.dao.extend.CreditInfoExtendMapper;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
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
    public Pager<CreditInfo> list(GetCreditInfoListRequest request) {
        request.webParamConvert();
        List<CreditInfo> houseInfoList = creditInfoExtendMapper.getCreditList(request);
        int houseInfoListCount = creditInfoExtendMapper.getCreditListCount(request);
        Pager<CreditInfo> pager = new Pager<CreditInfo>();
        pager.setPageNumber(request.getPageNumber());
        pager.setPageSize(request.getPageSize());
        pager.setList(houseInfoList);
        pager.setTotalCount(houseInfoListCount);
        return pager;
    }
}
