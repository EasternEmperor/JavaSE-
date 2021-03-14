package com.easterne.javase.reflect.bean;

public class UserService {

    public boolean login(String account, String passwd) {
        if ("admin".equals(account) && "123".equals(passwd)) {
            return true;
        }
        return false;
    }

    private void logout() {
        System.out.println("登出成功！");
    }

}
