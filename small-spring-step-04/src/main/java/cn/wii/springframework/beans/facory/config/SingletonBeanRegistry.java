package cn.wii.springframework.beans.facory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:37 下午
 * @Version 1.0
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}