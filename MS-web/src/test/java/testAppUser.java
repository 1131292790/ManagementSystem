import com.fuchuang.domain.users.AppUser;
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
        AppUser app = appUserService.getUserbyId("1");
        System.out.println(app);
    }
}
