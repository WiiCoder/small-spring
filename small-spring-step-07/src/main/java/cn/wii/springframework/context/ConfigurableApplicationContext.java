package cn.wii.springframework.context;

import cn.wii.springframework.beans.BeansException;

/**
 * @ClassName ConfigurableApplicationContext
 * @Description TODO
 * @Author wii
 * @Date 2021/8/5 3:40 下午
 * @Version 1.0
 */

public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
