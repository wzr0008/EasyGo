package Driver.DAO;

import Driver.POJO.Driver;
import org.bouncycastle.cms.jcajce.JcePasswordAuthenticatedRecipient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface DriverDao extends JpaRepository<Driver,Integer> {

}
