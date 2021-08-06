package cn.wii.springframework.beans.factory.config;

import cn.wii.springframework.beans.BeansException;

/**
 * @ClassName BeanPostProcessor
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:42 下午
 * @Version 1.0
 */

public interface BeanPostProcessor {

    /**
     * Bean 对象执行初始化方法之前执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * Bean 对象执行初始化方法之后执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
