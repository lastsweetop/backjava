import com.alibaba.fastjson.JSON;
import com.sweetop.studyhb.domain.Device;
import com.sweetop.studyhb.domain.User;
import com.sweetop.studyhb.service.DeviceService;
import com.sweetop.studyhb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午8:02
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-hibernate.xml"})
public class SHTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DeviceService deviceService;

    @Test
    public void testGetAllUser() {
        List<User> users = userService.getAllUsers();
        System.out.println(users.size());
        System.out.println(JSON.toJSONString(users.get(0).getDevices()));
    }

    @Test
    public void testGetAllDevice() {
         List<Device> devices=  deviceService.getAllDevices();
        System.out.println(devices);
    }
}
