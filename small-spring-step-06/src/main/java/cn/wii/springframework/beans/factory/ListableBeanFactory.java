package cn.wii.springframework.beans.factory;

import cn.wii.springframework.beans.BeansException;

import java.util.Map;

/**
 * @ClassName ListableBeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:44 下午
 * @Version 1.0
 */

public interface ListableBeanFactory extends BeanFactory {

    /**
     * 根据类型返回 Bean 实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中的 Bean 名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
