package com.winter.api.service.impl.inner;

import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.mapper.UserMapper;
import com.winter.remotecommon.pojo.User;
import com.winter.remotecommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @program: winterapi-backend
 * @description:
 * @author: Mr.Ye
 * @create: 2023-02-04 13:03
 **/
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getInvoker(String accessKey) {
		if (StringUtils.isBlank(accessKey)) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求参数不合法");
		}
		User invoker = userMapper.getInvoker(accessKey);
		if (invoker == null) {
			throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "用户不存在");
		}
		return invoker;
	}
}
