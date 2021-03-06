package cn.wii.springframework.beans.factory;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:36 δΈε
 * @Version 1.0
 */

public interface BeanFactory {

    /**
     * θ·ε Bean
     *
     * @param name beanName
     * @return Object
     */
    Object getBean(String name);
}
