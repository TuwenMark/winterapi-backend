package com.winter.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.winter.remotecommon.pojo.UserInterfaceInvoke;
import org.apache.ibatis.annotations.Param;

/**
* @author Admin
* @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Mapper
* @createDate 2022-11-28 22:45:38
* @Entity com.winter.api.model.entity.UserInterfaceInvoke
*/
public interface UserInterfaceInvokeMapper extends BaseMapper<UserInterfaceInvoke> {

	/**
	 * 统计接口调用次数
	 *
	 * @param userId 用户ID
	 * @param interfaceId 接口ID
	 * @return 接口调用次数更新结果
	 */
	void invokeCount(@Param("userId") Long userId, @Param("interfaceId") Long interfaceId);

	/**
	 * 查询是否存在调用信息
	 *
	 * @param userId 用户ID
	 * @param interfaceId 接口ID
	 * @return 用户接口调用信息
	 */
	UserInterfaceInvoke getInvokeInfo(@Param("userId") Long userId, @Param("interfaceId") Long interfaceId);
}




