package com.medipol.yazilimaraclari.RestAPIOrnek1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class RestApiOrnek1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApiOrnek1Application.class, args);
	}
	
	
	@RestController
	public static class Merhaba{
		
		@GetMapping("/merhaba")
		public String merhaba() {
			return "Merhaba";
		}
	}

}
