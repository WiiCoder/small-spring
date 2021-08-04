package cn.wii.springframework.beans;

/**
 * @ClassName PropertyValue
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 9:38 上午
 * @Version 1.0
 */

public class PropertyValue {
    private String name;
    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
