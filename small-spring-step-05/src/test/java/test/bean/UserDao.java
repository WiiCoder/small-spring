package test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author wii
 * @Date 2021/8/3 11:15 上午
 * @Version 1.0
 */

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001", "11");
        hashMap.put("1002", "22");
        hashMap.put("1003", "33");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
