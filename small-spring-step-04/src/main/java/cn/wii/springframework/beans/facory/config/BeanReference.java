package cn.wii.springframework.beans.facory.config;

/**
 * @ClassName BeanReference
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 9:39 上午
 * @Version 1.0
 */

public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
