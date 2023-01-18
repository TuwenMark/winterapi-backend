package com.winter.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserInterfaceInvokeServiceImplTest {
	@Resource
	private UserInterfaceInvokeService userInterfaceInvokeService;

	@Test
	void invokeCount() {
		userInterfaceInvokeService.invokeCount(1L, 2L);
	}
}