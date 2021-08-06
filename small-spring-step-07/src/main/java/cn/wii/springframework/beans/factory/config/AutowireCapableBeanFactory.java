package cn.wii.springframework.beans.factory.config;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.BeanFactory;

/**
 * @ClassName AutowireCapableBeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:18 下午
 * @Version 1.0
 */

public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
