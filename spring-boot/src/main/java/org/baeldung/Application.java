package org.nklkarthi;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@org.springframework.boot.autoconfigure.SpringBootApplication(exclude=MySQLAutoconfiguration.class)
public class Application {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(Application.class, args);
    }
}
