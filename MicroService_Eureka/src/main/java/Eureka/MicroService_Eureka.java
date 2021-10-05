package Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroService_Eureka {
    public static void main(String[] args) {
        SpringApplication.run(MicroService_Eureka.class,args);
    }
}
