package top.dogtcc.test.server3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {"top.dogtcc.database","top.dogtcc.core","top.dogtcc.intercept","top.dogtcc.message","top.dogtcc.test.server3"})
@Configuration
@EnableEurekaClient
public class Server3Application {

    public static void main(String[] args) {

        SpringApplication.run(Server3Application.class, args);

    }

}