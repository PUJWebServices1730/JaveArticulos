package com.javearticulos.javearticulos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.javearticulos"})
@EnableJpaRepositories(basePackages={"com.javearticulos"})
@EntityScan("com.javearticulos.entidades")
public class JavearticulosApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavearticulosApplication.class, args);
	}
}
