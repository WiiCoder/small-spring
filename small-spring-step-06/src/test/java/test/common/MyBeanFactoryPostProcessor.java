package test.common;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.PropertyValue;
import cn.wii.springframework.beans.PropertyValues;
import cn.wii.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.wii.springframework.beans.factory.config.BeanDefinition;
import cn.wii.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 5:30 下午
 * @Version 1.0
 */

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为字节跳动"));
    }
}
