package Trip;

import Trip.POJO.Trip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TripApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripApplication.class,args);
    }
}
