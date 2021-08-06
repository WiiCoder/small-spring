package cn.wii.springframework.beans.factory;

import cn.wii.springframework.beans.BeansException;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:36 下午
 * @Version 1.0
 */

public interface BeanFactory {

    /**
     * 获取 Bean
     *
     * @param name beanName
     * @return Object
     * @throws BeansException 异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 获取 Bean
     *
     * @param name beanName
     * @param args 构造参数
     * @return Object
     * @throws BeansException 异常
     */
    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
