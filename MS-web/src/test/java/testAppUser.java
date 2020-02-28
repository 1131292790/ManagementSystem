import com.fuchuang.domain.users.AppUser;
import com.fuchuang.service.users.AppUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/applicationContext.xml")
public class testAppUser {
    @Autowired
    private AppUserService appUserService;

}
