package com.monkey01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 09:44 17/9/22.
 * @Modify by:
 */
@ComponentScan("com.monkey01")
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
