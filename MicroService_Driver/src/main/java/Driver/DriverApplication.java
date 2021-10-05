package Driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DriverApplication {
    public static void main(String[] args) {
        SpringApplication.run(DriverApplication.class,args);
        return;
    }
}
