package cn.wii.springframework.beans.factory.support;

import cn.wii.springframework.core.io.DefaultResourceLoader;
import cn.wii.springframework.core.io.ResourceLoader;

/**
 * @ClassName AbstractBeanDefinitionReader
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:20 下午
 * @Version 1.0
 */

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
