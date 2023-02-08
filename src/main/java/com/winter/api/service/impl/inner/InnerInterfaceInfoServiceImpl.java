package com.winter.api.service.impl.inner;

import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.mapper.InterfaceInfoMapper;
import com.winter.remotecommon.pojo.InterfaceInfo;
import com.winter.remotecommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @program: winterapi-backend
 * @description:
 * @author: Mr.Ye
 * @create: 2023-02-04 13:24
 **/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
	@Resource
	private InterfaceInfoMapper interfaceInfoMapper;

	@Override
	public InterfaceInfo getInterfaceInfo(String url, String method) {
		if (StringUtils.isAnyBlank(url, method)) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求参数不合法");
		}
		InterfaceInfo interfaceInfo = interfaceInfoMapper.getInterfaceInfo(url, method);
		if (interfaceInfo == null) {
			throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "接口不存在");
		}
		return interfaceInfo;
	}
}
