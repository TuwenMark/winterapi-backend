package com.winter.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.mapper.UserInterfaceInvokeMapper;
import com.winter.api.model.enums.UserInterfaceInvokeStatusEnum;
import com.winter.api.service.UserInterfaceInvokeService;
import com.winter.remotecommon.pojo.UserInterfaceInvoke;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Admin
 * @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Service实现
 * @createDate 2022-11-28 22:45:38
 */
@Service
public class UserInterfaceInvokeServiceImpl extends ServiceImpl<UserInterfaceInvokeMapper, UserInterfaceInvoke>
		implements UserInterfaceInvokeService {
	@Resource
	private UserInterfaceInvokeMapper userInterfaceInvokeMapper;

	@Override
	public void validUserInterfaceInvoke(UserInterfaceInvoke userInterfaceInvoke, boolean add) {
		if (userInterfaceInvoke == null) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
		Long interfaceId = userInterfaceInvoke.getInterfaceId();
		Long userId = userInterfaceInvoke.getUserId();
		Integer totalNum = userInterfaceInvoke.getTotalNum();
		Integer restNum = userInterfaceInvoke.getRestNum();
		Integer status = userInterfaceInvoke.getStatus();
		if (interfaceId <= 0 || userId <= 0 ) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户或接口不存在");
		}
		if (totalNum <= 0 || restNum < 0) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "调用次数填写有误");
		}
		if (status != null && !UserInterfaceInvokeStatusEnum.getValues().contains(status)) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
	}

	@Override
	public void invokeCount(Long userId, Long interfaceId) {
		if (userId <= 0 || interfaceId <= 0) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
		userInterfaceInvokeMapper.invokeCount(userId, interfaceId);
	}
}




