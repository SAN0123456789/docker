package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Springdock1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdock1Application.class, args);
	}
}


@Controller
class IndexController{

	static String randomWebAppID= new String(new Random().toString());

	@GetMapping("/")

	@ResponseBody

	public String index() {

		return "ID "+ randomWebAppID + " : Hello World from Spring, Hi Docker";

	}
}

