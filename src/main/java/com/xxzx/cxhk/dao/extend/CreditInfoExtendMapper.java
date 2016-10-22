package com.xxzx.cxhk.dao.extend;


import com.xxzx.cxhk.dao.mbg.CreditInfoMapper;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
import com.xxzx.cxhk.entity.CreditInfo;

import java.util.List;

public interface CreditInfoExtendMapper extends CreditInfoMapper{

    List<CreditInfo> getCreditList(GetCreditInfoListRequest request);

    int getCreditInfoListCount(GetCreditInfoListRequest request);
}