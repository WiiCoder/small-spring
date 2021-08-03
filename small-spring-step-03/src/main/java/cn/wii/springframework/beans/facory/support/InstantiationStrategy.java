package cn.wii.springframework.beans.facory.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.facory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @ClassName InstantiationStrategy
 * @Description TODO
 * @Author wii
 * @Date 2021/8/2 3:53 下午
 * @Version 1.0
 */

public interface InstantiationStrategy {

    /**
     * 实例化对象
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> ctor,Object[] args) throws BeansException;
}
