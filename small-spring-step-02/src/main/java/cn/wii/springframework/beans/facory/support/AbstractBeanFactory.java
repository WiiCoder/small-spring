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
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    /**
     * 获取 BeanDefinition 对象
     * @param beanName bean
     * @return BeanDefinition 对象
     * @throws BeansException 异常
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建 BeanDefinition 对象
     * @param beanName bean
     * @param beanDefinition 被创建的 BeanDefinition 对象
     * @return 对象
     * @throws BeansException 异常
     */
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws  BeansException;
}
