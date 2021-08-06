package cn.wii.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Resource
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:22 下午
 * @Version 1.0
 */

public interface Resource {

    InputStream getInputStream() throws IOException;
}
