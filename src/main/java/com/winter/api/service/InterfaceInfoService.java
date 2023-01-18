package com.winter.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.winter.remotecommon.pojo.InterfaceInfo;

/**
* @author m1869
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2022-11-06 16:52:03
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

	/**
	 * 校验
	 *
	 * @param interfaceInfo 接口信息
	 * @param add 是否为创建校验
	 */
	void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
