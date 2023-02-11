package com.winter.api.service;

import com.winter.api.model.vo.InterfaceInvokeVO;

import java.util.List;

/**
 * @program: winterapi-backend
 * @description: 数据分析服务
 * @author: Mr.Ye
 * @create: 2023-02-08 21:33
 **/
public interface AnalysisService {
	List<InterfaceInvokeVO> listTopInterfaceInvoke(Integer topN);
}
