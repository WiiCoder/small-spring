package cn.wii.springframework.context.support;

import cn.wii.springframework.beans.BeansException;
import cn.wii.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.wii.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @ClassName AbstractRefreshableApplicationContext
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:40 下午
 * @Version 1.0
 */

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
