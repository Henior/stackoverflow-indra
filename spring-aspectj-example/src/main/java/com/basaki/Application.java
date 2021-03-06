package com.basaki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * {@code BookApplication} represents the entry point for the Spring
 * boot application example.
 * <p/>
 *
 * @author Indra Basak
 * @since 10/4/17
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
@ComponentScan(basePackages = {"com.basaki"})
@Component
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
