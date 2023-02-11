package com.winter.api.service.impl;

import com.winter.api.mapper.UserInterfaceInvokeMapper;
import com.winter.api.model.vo.InterfaceInvokeVO;
import com.winter.api.service.AnalysisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: winterapi-backend
 * @description: 数据分析服务
 * @author: Mr.Ye
 * @create: 2023-02-08 21:34
 **/
@Service
public class AnalysisServiceImpl implements AnalysisService {
	@Resource
	private UserInterfaceInvokeMapper userInterfaceInvokeMapper;

	@Override
	public List<InterfaceInvokeVO> listTopInterfaceInvoke(Integer topN) {
		List<InterfaceInvokeVO> interfaceInvokeVOList = userInterfaceInvokeMapper.listTopInterfaceInvoke(topN);
		return interfaceInvokeVOList;
	}
}
