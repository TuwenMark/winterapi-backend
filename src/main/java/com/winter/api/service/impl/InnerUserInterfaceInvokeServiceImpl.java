package com.winter.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.mapper.UserInterfaceInvokeMapper;
import com.winter.remotecommon.pojo.UserInterfaceInvoke;
import com.winter.remotecommon.service.InnerUserInterfaceInvokeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Admin
 * @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Service实现
 * @createDate 2022-11-28 22:45:38
 */
@Service
public class InnerUserInterfaceInvokeServiceImpl extends ServiceImpl<UserInterfaceInvokeMapper, UserInterfaceInvoke>
		implements InnerUserInterfaceInvokeService {
	@Resource
	private UserInterfaceInvokeMapper userInterfaceInvokeMapper;

	@Override
	public void invokeCount(Long userId, Long interfaceId) {
		if (userId <= 0 || interfaceId <= 0) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
		userInterfaceInvokeMapper.invokeCount(userId, interfaceId);
	}
}




