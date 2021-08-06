package cn.wii.springframework.beans.factory.config;

import cn.wii.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @ClassName ConfigurableBeanFactory
 * @Description Configuration interface to be implemented by most bean factories. Provides
 *         facilities to configure a bean factory, in addition to the bean factory
 *         client methods in the {@link cn.wii.springframework.beans.factory.BeanFactory}
 *         interface.
 * @Author wii
 * @Date 2021/8/3 2:18 下午
 * @Version 1.0
 */

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
