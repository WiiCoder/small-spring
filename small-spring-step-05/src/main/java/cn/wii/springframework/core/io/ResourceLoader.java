package cn.wii.springframework.core.io;

/**
 * @ClassName ResourceLoader
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:23 下午
 * @Version 1.0
 */

public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
