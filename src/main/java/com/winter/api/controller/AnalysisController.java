package com.winter.api.controller;

import com.winter.api.annotation.AuthCheck;
import com.winter.api.common.BaseResponse;
import com.winter.api.common.ErrorCode;
import com.winter.api.common.ResultUtils;
import com.winter.api.model.vo.InterfaceInvokeVO;
import com.winter.api.service.AnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: winterapi-backend
 * @description: 接口调用分析接口
 * @author: Mr.Ye
 * @create: 2023-02-08 21:23
 **/
@RestController
@RequestMapping("/interface/invoke")
public class AnalysisController {

	@Resource
	private AnalysisService analysisService;

	@GetMapping("/top/{topN}")
	@AuthCheck(mustRole = "admin")
	public BaseResponse<List<InterfaceInvokeVO>> listTopInterfaceInvoke(@PathVariable Integer topN) {
		List<InterfaceInvokeVO> interfaceInvokeVOList = analysisService.listTopInterfaceInvoke(topN);
		if (interfaceInvokeVOList == null || interfaceInvokeVOList.isEmpty()) {
			return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "数据为空或不存在！");
		}
		return ResultUtils.success(interfaceInvokeVOList);
	}
}
