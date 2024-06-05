package io.whatap.caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallerApplication.class, args);
    }

}
