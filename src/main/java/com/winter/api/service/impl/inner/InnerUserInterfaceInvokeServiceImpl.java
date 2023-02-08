package com.winter.api.service.impl.inner;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.mapper.UserInterfaceInvokeMapper;
import com.winter.remotecommon.pojo.UserInterfaceInvoke;
import com.winter.remotecommon.service.InnerUserInterfaceInvokeService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Admin
 * @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Service实现
 * @createDate 2022-11-28 22:45:38
 */
@DubboService
public class InnerUserInterfaceInvokeServiceImpl implements InnerUserInterfaceInvokeService {
	@Resource
	private UserInterfaceInvokeMapper userInterfaceInvokeMapper;

	@Override
	public void invokeCount(Long userId, Long interfaceId) {
		// 参数校验
		if (userId <= 0 || interfaceId <= 0) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
		// 查询数据库是否存在调用次数
		UserInterfaceInvoke userInterfaceInvoke = userInterfaceInvokeMapper.getInvokeInfo(userId, interfaceId);
		if (userInterfaceInvoke == null || userInterfaceInvoke.getRestNum() <= 0) {
			throw new BusinessException(ErrorCode.NO_AUTH_ERROR, "用户无权限或调用次数不足");
		}
		userInterfaceInvokeMapper.invokeCount(userId, interfaceId);
	}
}




