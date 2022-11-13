package com.winter.api.service.impl;

import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winter.api.common.ErrorCode;
import com.winter.api.exception.BusinessException;
import com.winter.api.model.entity.InterfaceInfo;
import com.winter.api.model.entity.Post;
import com.winter.api.model.enums.InterfaceStatusEnum;
import com.winter.api.model.enums.PostGenderEnum;
import com.winter.api.model.enums.PostReviewStatusEnum;
import com.winter.api.service.InterfaceInfoService;
import com.winter.api.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author m1869
 * @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
 * @createDate 2022-11-06 16:52:03
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
		implements InterfaceInfoService {

	@Override
	public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
		if (interfaceInfo == null) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
		String name = interfaceInfo.getName();
		String description = interfaceInfo.getDescription();
		String url = interfaceInfo.getUrl();
		String method = interfaceInfo.getMethod();
		String requestHeader = interfaceInfo.getRequestHeader();
		String responseHeader = interfaceInfo.getResponseHeader();
		Integer status = interfaceInfo.getStatus();
		// 创建时，所有参数必须非空
		if (add) {
			if (StringUtils.isAnyBlank(name, description, url, method, requestHeader, responseHeader)) {
				throw new BusinessException(ErrorCode.PARAMS_ERROR);
			}
		}
		if (StringUtils.isNotBlank(name) && name.length() > 20) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
		}
		if (StringUtils.isNotBlank(description) && description.length() > 8192) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR, "简介过长");
		}
		if (status != null && !InterfaceStatusEnum.getValues().contains(status)) {
			throw new BusinessException(ErrorCode.PARAMS_ERROR);
		}
	}
}




