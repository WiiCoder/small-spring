package cn.wii.springframework.test;

import cn.wii.springframework.BeanDefinition;
import cn.wii.springframework.BeanFactory;
import cn.wii.springframework.test.bean.UserService;
import org.junit.Test;

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
        BeanFactory factory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        factory.registerBeanDefinition("userService",beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();
    }
}
