import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroService_User {
    public static void main(String[] args) {
        SpringApplication.run(MicroService_User.class,args);
    }
}
