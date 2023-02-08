package com.winter.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.winter.remotecommon.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Entity com.winter.api.model.domain.User
 */
public interface UserMapper extends BaseMapper<User> {
	/**
	 * 根据accessKey查询用户信息
	 *
	 * @param accessKey AK
	 * @return 用户信息
	 */
	User getInvoker(@Param("accessKey") String accessKey);
}




