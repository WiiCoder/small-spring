package cn.wii.springframework.beans.facory.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.core.io.Resource;
import cn.wii.springframework.core.io.ResourceLoader;

/**
 * @ClassName BeanDefinitionReader
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:20 下午
 * @Version 1.0
 */

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
