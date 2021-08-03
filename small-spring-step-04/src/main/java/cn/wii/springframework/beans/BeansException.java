package cn.wii.springframework.beans;

/**
 * @ClassName BeansException
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:36 下午
 * @Version 1.0
 */

public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
