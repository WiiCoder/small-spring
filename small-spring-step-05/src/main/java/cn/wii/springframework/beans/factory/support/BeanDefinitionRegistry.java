package cn.wii.springframework.beans.factory.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:37 下午
 * @Version 1.0
 */

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
