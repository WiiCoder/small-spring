package cn.wii.springframework.beans.factory.config;

/**
 * @ClassName BeanDefinition
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:36 下午
 * @Version 1.0
 */

public class BeanDefinition {

    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
