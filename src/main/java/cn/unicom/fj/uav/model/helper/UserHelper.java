package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.User;

public class UserHelper extends User {
private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserHelper() {
    }

    public UserHelper(User user) {
        this.user = user;
    }
}
