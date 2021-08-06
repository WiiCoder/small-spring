package cn.wii.springframework.beans.factory;

/**
 * @ClassName InitializingBean
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 2:25 下午
 * @Version 1.0
 */

public interface InitializingBean {

    void afterPropertiesSet();
}
