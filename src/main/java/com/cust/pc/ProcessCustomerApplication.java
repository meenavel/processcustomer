package com.cust.pc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProcessCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessCustomerApplication.class, args);
	}

//	@Bean
//	public ObjectMapper objectMapper() {
//		return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
//	}

}
