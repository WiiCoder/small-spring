package test.bean;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:06 下午
 * @Version 1.0
 */

public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }

    public void queryUserInfo() {
        System.out.println("查询用户数据: " + this.name);
    }
}
