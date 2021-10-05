package Dispatch.Service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class restTemplate {
    @LoadBalanced
    public RestTemplate get(){
        return new RestTemplate();
    }

}
