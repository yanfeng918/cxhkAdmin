package com.xxzx.cxhk.controller;

import com.xxzx.cxhk.bean.Pager;
import com.xxzx.cxhk.dto.request.GetCreditInfoListRequest;
import com.xxzx.cxhk.dto.response.GetCreditInfoListResponse;
import com.xxzx.cxhk.entity.CreditInfo;
import com.xxzx.cxhk.entity.Info;
import com.xxzx.cxhk.service.CreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="creditInfo")
public class CreditInfoController {

	@Autowired
	private CreditInfoService creditInfoService;
	

	@RequestMapping(value="/getList")
	@ResponseBody
	public Pager<GetCreditInfoListResponse> getList(Model model, GetCreditInfoListRequest request) {
		Pager<GetCreditInfoListResponse> pager = creditInfoService.list(request);
		List<GetCreditInfoListResponse> list = pager.getList();
		GetCreditInfoListResponse[] data = list.toArray(new GetCreditInfoListResponse[list.size()]);
		pager.setData(data);
		return pager;
	}


	@RequestMapping(value="/list")
	public String list() {
		return "/creditInfo/list";
	}
	
}
