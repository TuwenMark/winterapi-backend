package com.winter.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.winter.remotecommon.pojo.InterfaceInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author m1869
 * @description 针对表【interface_info(接口信息表)】的数据库操作Mapper
 * @createDate 2022-11-06 16:52:03
 * @Entity com.winter.api.model.entity.InterfaceInfo
 */
public interface InterfaceInfoMapper extends BaseMapper<InterfaceInfo> {

	/**
	 * 获取接口信息
	 *
	 * @param url    请求URL
	 * @param method 请求方法
	 * @return 接口信息
	 */
	InterfaceInfo getInterfaceInfo(@Param("url") String url, @Param("method") String method);
}




