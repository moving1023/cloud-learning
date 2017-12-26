package com.liyl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/26
 * @Modified by .
 */
@RestController
public class FileController {

	protected Logger logger = LoggerFactory.getLogger(FileController.class);

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/download")
	public void download() {
		logger.info("这是一个下载任务：即将请求下载服务");
	}

	@RequestMapping("/registered")
	public String getRegistered(){
		List<ServiceInstance> list = discoveryClient.getInstances("STORES");
		System.out.println(discoveryClient.getServices());
		System.out.println("discoveryClient.getServices().size() = " + discoveryClient.getServices().size());

		for( String s :  discoveryClient.getServices()){
			System.out.println("services " + s);
			List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);
			for(ServiceInstance si : serviceInstances){
				System.out.println("    services:" + s + ":getHost()=" + si.getHost());
				System.out.println("    services:" + s + ":getPort()=" + si.getPort());
				System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());
				System.out.println("    services:" + s + ":getUri()=" + si.getUri());
				System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());
			}

		}

		System.out.println(list.size());
		if (list != null && list.size() > 0 ) {
			System.out.println( list.get(0).getUri()  );
		}
		return null;
	}
}
