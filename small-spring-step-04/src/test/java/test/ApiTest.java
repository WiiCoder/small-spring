package test;

import cn.wii.springframework.beans.PropertyValue;
import cn.wii.springframework.beans.PropertyValues;
import cn.wii.springframework.beans.facory.config.BeanDefinition;
import cn.wii.springframework.beans.facory.config.BeanReference;
import cn.wii.springframework.beans.facory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserDao;
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

        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uid", "1001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        String userServiceStr = "userService";
        beanFactory.registerBeanDefinition(userServiceStr, beanDefinition);

        UserService userService = (UserService) beanFactory.getBean(userServiceStr);

        userService.queryUserInfo();
    }

}
