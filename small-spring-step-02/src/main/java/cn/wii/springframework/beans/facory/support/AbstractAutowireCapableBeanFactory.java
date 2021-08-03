package cn.wii.springframework.beans.facory.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.facory.config.BeanDefinition;

/**
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:37 下午
 * @Version 1.0
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName,bean);
        return bean;
    }
}
