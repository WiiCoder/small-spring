package cn.wii.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName FileSystemResource
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 2:22 下午
 * @Version 1.0
 */

public class FileSystemResource implements Resource {

    private final File file;

    private final String path;

    public FileSystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }


    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath() {
        return this.path;
    }
}
