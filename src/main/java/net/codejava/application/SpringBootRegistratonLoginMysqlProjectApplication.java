package net.codejava.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "net.codejava.controllers")
@EnableJpaRepositories(basePackages = "net.codejava.repo")
@EntityScan(basePackages = "net.codejava.entity")
@Import(WebSecurityConfig.class)
public class SpringBootRegistratonLoginMysqlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRegistratonLoginMysqlProjectApplication.class, args);
	}

}
