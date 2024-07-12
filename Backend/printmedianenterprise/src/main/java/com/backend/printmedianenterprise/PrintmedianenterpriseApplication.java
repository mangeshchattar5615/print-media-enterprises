package com.backend.printmedianenterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.backend.printmedianenterprise","com.backend.printmedianenterprise.Controller","com.backend.printmedianenterprise.Dto","com.backend.printmedianenterprise.Entity","com.backend.printmedianenterprise.Services.Category","backend.printmedianenterprise.Repository","com.backend.printmedianenterprise.Config","com.backend.printmedianenterprise.Util"})
@EntityScan("com.backend.printmedianenterprise.Entity")
@EnableJpaRepositories(basePackages="com.backend.printmedianenterprise.Repository")
public class PrintmedianenterpriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintmedianenterpriseApplication.class, args);
	}

}
