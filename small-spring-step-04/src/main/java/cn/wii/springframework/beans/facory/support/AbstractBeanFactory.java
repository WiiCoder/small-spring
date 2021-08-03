package cn.wii.springframework.beans.facory.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.facory.BeanFactory;
import cn.wii.springframework.beans.facory.config.BeanDefinition;

/**
 * @ClassName AbstractBeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:37 下午
 * @Version 1.0
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
