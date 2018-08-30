package com.platform.eureka.server.provider;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "/register", tags = "服务注册测试") 
@RestController
@RequestMapping(value = "register")
class ServiceInstanceRestController {
	private Logger logger=LoggerFactory.getLogger(ServiceInstanceRestController.class);
//	@Autowired
//	private DiscoveryClient discoveryClient;

	@ApiOperation(value = "添加用户信息", notes = "添加用户信息")
	@ApiImplicitParam(name = "applicationName", value = "subAppId", required = true, dataType = "com.platflat.eureka.server.entity.SubApp")
	@RequestMapping(value = "/service-instances/{applicationName}", method = { RequestMethod.POST, RequestMethod.GET })
	public List<String> servceInstancesByApplicationName(@PathVariable String subAppId) {
		List<String> list=new ArrayList<String>();
		try {
			logger.info("subAppId:"+subAppId);
			list.add(subAppId);
		} catch (Exception e) {
			logger.error("Exception:"+e);
		}
		return list;
	}
}