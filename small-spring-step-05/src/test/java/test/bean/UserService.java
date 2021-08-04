package test.bean;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author wii
 * @Date 2021/7/28 2:06 下午
 * @Version 1.0
 */

public class UserService {

    private String uid;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户数据: " + this.userDao.queryUserName(uid));
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
