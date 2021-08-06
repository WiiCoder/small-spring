package cn.wii.springframework.context.support;

import cn.wii.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.wii.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @ClassName AbstractXmlApplicationContext
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:41 下午
 * @Version 1.0
 */

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
