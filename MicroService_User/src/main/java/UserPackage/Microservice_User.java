package UserPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservice_User {
    public static void main(String[] args) {
        SpringApplication.run(Microservice_User.class,args);
    }
}
