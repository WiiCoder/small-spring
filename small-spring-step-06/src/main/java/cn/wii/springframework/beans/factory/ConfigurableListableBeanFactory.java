package cn.wii.springframework.beans.factory;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.wii.springframework.beans.factory.config.BeanDefinition;
import cn.wii.springframework.beans.factory.config.BeanPostProcessor;
import cn.wii.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @ClassName ConfigurableListableBeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:43 下午
 * @Version 1.0
 */

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
