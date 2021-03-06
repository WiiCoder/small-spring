package test;

import cn.wii.springframework.beans.factory.config.BeanDefinition;
import cn.wii.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;

/**
 * @ClassName ApiTest
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:07 下午
 * @Version 1.0
 */

public class ApiTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        String userServiceStr = "userService";
        beanFactory.registerBeanDefinition(userServiceStr, beanDefinition);

        UserService userService = (UserService) beanFactory.getBean(userServiceStr);

        userService.queryUserInfo();
    }

}
