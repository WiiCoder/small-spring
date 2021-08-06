package cn.wii.springframework.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description 单例注册表
 * @Author wii
 * @Date 2021/7/28 2:37 下午
 * @Version 1.0
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
