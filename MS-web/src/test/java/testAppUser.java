import com.fuchuang.domain.auth.AppUser;
import com.fuchuang.service.auth.AppUserService;
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

    @Test
    public void testfindUserbyId(){
        AppUser app = appUserService.findUserbyId("1");
        System.out.println(app);
    }
}
