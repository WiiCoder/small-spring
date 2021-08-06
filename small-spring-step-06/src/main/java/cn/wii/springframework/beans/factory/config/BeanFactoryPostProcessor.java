package cn.wii.springframework.beans.factory.config;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @ClassName BeanFactoryPostProcessor
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:42 下午
 * @Version 1.0
 */

public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
