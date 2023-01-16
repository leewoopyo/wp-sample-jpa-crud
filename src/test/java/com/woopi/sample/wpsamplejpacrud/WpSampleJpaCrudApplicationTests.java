package com.woopi.sample.wpsamplejpacrud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.woopi.sample.wpsamplejpacrud.api.sample.entity.SampleEntity;

@SpringBootTest
class WpSampleJpaCrudApplicationTests {

	@Test
	void contextLoads() {

		System.out.println("11111");

		RestTemplate restTemplate = new RestTemplate();
		//헤더설정
		HttpHeaders httpHeaders = new HttpHeaders();

		SampleEntity[] list = restTemplate.getForObject("http://localhost:8080/api/sample/list", SampleEntity[].class, httpHeaders);
		
		for (SampleEntity entity : list) {
			System.out.println("entity : " + entity.toString());
		}

	}

}
