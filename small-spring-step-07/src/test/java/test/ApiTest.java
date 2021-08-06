package test;

import cn.wii.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.wii.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.wii.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import test.bean.UserService;
import test.common.MyBeanFactoryPostProcessor;
import test.common.MyBeanPostProcessor;

/**
 * @ClassName ApiTest
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:07 下午
 * @Version 1.0
 */

public class ApiTest {

    @Test
    public void test() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        UserService userService = beanFactory.getBean("userService", UserService.class);
        userService.queryUserInfo();

    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }

}
