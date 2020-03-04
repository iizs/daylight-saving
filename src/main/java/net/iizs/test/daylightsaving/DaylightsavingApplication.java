package net.iizs.test.daylightsaving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DaylightsavingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaylightsavingApplication.class, args);
	}

}
