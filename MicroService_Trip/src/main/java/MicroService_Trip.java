import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroService_Trip {
    public static void main(String[] args) {
        SpringApplication.run(MicroService_Trip.class,args);
    }
}
