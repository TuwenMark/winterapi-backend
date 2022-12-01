package com.winter.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.winter.api.model.entity.UserInterfaceInvoke;

/**
* @author Admin
* @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Service
* @createDate 2022-11-28 22:45:38
*/
public interface UserInterfaceInvokeService extends IService<UserInterfaceInvoke> {

	/**
	 * 校验
	 *
	 * @param userInterfaceInvoke 用户接口调用信息
	 * @param add 是否为创建校验
	 */
	void validUserInterfaceInvoke(UserInterfaceInvoke userInterfaceInvoke, boolean add);

}
