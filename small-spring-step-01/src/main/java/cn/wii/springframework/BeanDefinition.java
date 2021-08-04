package cn.wii.springframework;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义
 * @Author wii
 * @Date 2021/7/28 1:52 下午
 * @Version 1.0
 */

public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
