package Driver.Service;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Set;

@Service
public class JedisService {
  Jedis jedis=new Jedis("127.0.0.1",6379);
  public String ping(){
    return jedis.ping();
  }
   public void showall(){
      Set<String> keys=jedis.keys("*");
      for(String key:keys)
          System.out.println(key);
   }
   public boolean exist(String key){
      return jedis.exists(key);
   }
   public String getVal(String key){
      if(jedis.exists(key)){
          return jedis.get(key);
      }
      return null;
   }
   public void set(String key,String val){
      jedis.set(key,val);
      return;
   }
 }
