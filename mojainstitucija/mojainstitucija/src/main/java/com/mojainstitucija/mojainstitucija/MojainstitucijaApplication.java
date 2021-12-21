package com.mojainstitucija.mojainstitucija;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.mojainstitucija.mojainstitucija"})
public class MojainstitucijaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MojainstitucijaApplication.class, args);
    }


}
