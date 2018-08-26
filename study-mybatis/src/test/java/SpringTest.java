import com.alibaba.fastjson.JSON;
import com.sweetop.studymybatis.domain.DUser;
import com.sweetop.studymybatis.service.DUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 上午11:53
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class SpringTest {
    @Autowired
    private DUserService dUserService;

    @Test
    public void testGetDUserById() {
        DUser dUser=dUserService.getDUserById(1);
        System.out.println(JSON.toJSONString(dUser));
    }

    @Test
    public void testGetAllDUser() {
        List<DUser> dUsers=dUserService.getAllDUser();
        System.out.println(JSON.toJSONString(dUsers));
    }
}
