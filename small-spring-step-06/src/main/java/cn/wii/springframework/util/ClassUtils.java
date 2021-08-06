package cn.wii.springframework.util;

/**
 * @ClassName ClassUtils
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:24 下午
 * @Version 1.0
 */

public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - failing back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
