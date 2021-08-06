package cn.wii.springframework.beans.factory;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:36 下午
 * @Version 1.0
 */

public interface BeanFactory {

    /**
     * 获取 Bean
     *
     * @param name beanName
     * @return Object
     */
    Object getBean(String name);
}
