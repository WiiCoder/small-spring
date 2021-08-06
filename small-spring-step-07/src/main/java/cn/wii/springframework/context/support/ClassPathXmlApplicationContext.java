package cn.wii.springframework.context.support;

import cn.wii.springframework.beans.BeansException;

/**
 * @ClassName ClassPathXmlApplicationContext
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:41 下午
 * @Version 1.0
 */

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
