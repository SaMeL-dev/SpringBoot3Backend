package me.seungjun.springboot3backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBoot3BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3BackendApplication.class, args);
    }

}
