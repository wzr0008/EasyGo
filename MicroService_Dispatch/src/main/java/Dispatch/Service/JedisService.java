package Dispatch.Service;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Set;

@Component
public class JedisService {
    Jedis jedis=new Jedis("127.0.0.1",6379);
    public String ping(){
        return jedis.ping();
    }
    public void showall(){
        Set<String> keys=jedis.keys("*");
        for(String key:keys){
            System.out.println(key);
        }
    }
    public boolean exist(String key){
        return jedis.exists(key);
    }
    public String getval(String key){
        return jedis.get(key);
    }
    public void add(String key,String val){
        jedis.set(key,val);
        return;
    }
}
