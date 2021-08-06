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

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 根据 beanName 查询 BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含制定名称的 BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回注册表中所有 BeanDefinition 名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
