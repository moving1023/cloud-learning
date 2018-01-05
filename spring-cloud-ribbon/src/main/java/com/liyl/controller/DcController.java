package com.liyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/28
 * @Modified by .
 */
@RestController
public class DcController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String dc() {
		return restTemplate.getForObject("http://user-service/user/1", String.class);
	}
}
