package test.common;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.config.BeanPostProcessor;
import test.bean.UserService;

/**
 * @ClassName MyBeanPostProcessor
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 5:32 下午
 * @Version 1.0
 */

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
