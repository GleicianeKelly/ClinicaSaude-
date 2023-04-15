package api.msvacina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsvacinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvacinaApplication.class, args);
	}

}
